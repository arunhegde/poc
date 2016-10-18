package com.palerra.assignments.utils;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Utils {
	private static final Log LOG = LogFactory.getLog(Utils.class);
	
	public static final String NEW_LINE_CHAR = "\n";

	public static void print(final Object object) {
		if (null != object) {
			System.out.println(object.toString());
		}
	}
	
	public static Boolean isNull(final Object object) {
		return (object == null ? true : false);
	}
	
	public static Boolean isEmpty(final String string) {
		if (!isNull(string) && !string.isEmpty()) {
			return false;
		}
		return true;
	}
	
	public static String listToString(final List<String> list, final String delimiter) {
		StringBuilder stringBuilder = new StringBuilder();
		Boolean firstItem = true;
		
		if (!isNull(list)) {
			for(String item : list) {
				if (firstItem) {
					stringBuilder.append(item);
					firstItem = false;
				}
				stringBuilder.append(delimiter).append(item);
			}
		}
		
		return stringBuilder.toString();
	}

	public static Class<?> getClassInstance(final String className) {
		Class<?> classInstance = null;
		try {
			classInstance = Class.forName(className);
		} catch (ClassNotFoundException e1) {
			LOG.error("ClassNotFoundException error while loading class [" + className + "]. Trying again with context class loader.");
			
			ClassLoader classLoader = getClassLoader();
			
			try {
				classInstance = classLoader.loadClass(className);
				LOG.info("Successfully loaded class [" + className + "].");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		return classInstance;
	}

	public static URI getResourcePath(final String fileName) throws URISyntaxException {
		ClassLoader classLoader = getClassLoader();
		return classLoader.getResource(fileName).toURI();
	}

	public static File getResourceFile(final String fileName) {
		// Get file from resources folder
		ClassLoader classLoader = getClassLoader();
		return new File(classLoader.getResource(fileName).getFile());
	}

	private static ClassLoader getClassLoader() {
		Thread t = Thread.currentThread();
		ClassLoader classLoader = t.getContextClassLoader();
		return classLoader;
	}
	
	public static File getFile(final String fileName) {
		File f = new File(fileName);
		return (f.exists() && !f.isDirectory() ? f : getResourceFile(fileName));
	}
}
