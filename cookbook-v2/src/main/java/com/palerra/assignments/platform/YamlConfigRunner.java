package com.palerra.assignments.platform;

import java.io.IOException;

public class YamlConfigRunner {
	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			System.out.println("Usage: <file.yml>");
			return;
		}
		
		String fileName = args[0];
		ClientApplicationSchemaValidator validator = new ClientApplicationSchemaValidator();
		try {
			validator.validate(fileName);
			System.out.println(String.format("Validation complete for %s", fileName));
		} catch (ValidationException e) {
			System.err.println(String.format("Validation failed for %s with error %s", fileName, e.getMessage()));
		}
	}
}
