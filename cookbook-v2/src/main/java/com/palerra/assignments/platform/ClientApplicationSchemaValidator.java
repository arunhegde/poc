package com.palerra.assignments.platform;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.json.JSONObject;
import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.main.JsonValidator;
import com.palerra.assignments.model.Configuration;
import com.palerra.assignments.utils.Utils;

public class ClientApplicationSchemaValidator {
	private static final String SCHEMA_FILE_NAME = "application-schema.json";
	
	public void validate(String fileName) throws ValidationException {
		try {
			validateJsonData(SCHEMA_FILE_NAME, fileName);
			Configuration config = getConfiguration(fileName);
			System.out.println(String.format("Successfully read configuration for application %s",
					config.getAppControlCatalog().getName()));
		} catch (Exception e) {
			e.printStackTrace();
			throw new ValidationException(e);
		}
	}

	private Configuration getConfiguration(final String fileName)
			throws JsonParseException, JsonMappingException, IOException {
		Configuration config = null;

		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		config = mapper.readValue(Utils.getResourceFile(fileName), Configuration.class);

		return config;
	}
	
	@SuppressWarnings("unchecked")
	private String convertToJson(String yamlFileName) throws FileNotFoundException {
	    Yaml yaml= new Yaml();
	    FileReader fr = new FileReader(Utils.getResourceFile(yamlFileName)); 
	    
	    Map<String,Object> map= (Map<String, Object>) yaml.load(fr);

	    JSONObject jsonObject=new JSONObject(map);
	    return jsonObject.toString();
	}
	
    private void validateJsonData(final String jsonSchemaFileName, final String yamlFileName)
            throws ValidationException {
        try {
        	String jsonData = convertToJson(jsonSchemaFileName);
            System.out.println("jsonData = " + jsonData);
        	
            final JsonNode data = JsonLoader.fromString(jsonData);
            final JsonNode schema = JsonLoader.fromFile(Utils.getResourceFile(jsonSchemaFileName));

            final JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
            JsonValidator v = factory.getValidator();

            ProcessingReport report = v.validate(schema, data);
            System.out.println(report);
            if (!report.toString().contains("success")) {
                throw new ValidationException(
                        report.toString());
            }
        } catch (IOException e) {
            throw new ValidationException(
                    "Failed to validate json data", e);
        } catch (ProcessingException e) {
            throw new ValidationException(
                    "Failed to validate json data", e);
        }
    }
}
