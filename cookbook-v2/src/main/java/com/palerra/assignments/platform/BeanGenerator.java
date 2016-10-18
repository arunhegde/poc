package com.palerra.assignments.platform;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.rules.RuleFactory;

import com.sun.codemodel.JCodeModel;

public class BeanGenerator {
	private static final String GENERATED_BEANS_PATH = "src/main/java";

	public static void main(String[] args) {
		generateClasses();
	}

	public static void generateClasses() {
		JCodeModel codeModel = new JCodeModel();

		try {
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			URL source = classLoader.getResource("application-schema.json");

			GenerationConfig config = new DefaultGenerationConfig() {
				@Override
				public boolean isGenerateBuilders() {
					return true;
				}

				@Override
				public boolean isIncludeAdditionalProperties() {
					return false;
				}
			};

			SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(), new SchemaStore()),
					new SchemaGenerator());
			mapper.generate(codeModel, "Configuration", "com.palerra.assignments.model", source);

			codeModel.build(getOutputPath(GENERATED_BEANS_PATH));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static File getOutputPath(String dir) throws IOException {
		File outputDir = new File(dir);
		if (!outputDir.exists()) {
			boolean created = outputDir.mkdirs();
			if (!created) {
				throw new IOException("Unable to create output directory " + dir);
			}
		}

		return outputDir;
	}
}
