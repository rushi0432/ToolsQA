package com.toolsQA.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class propconfi {

	public static Properties prop;

	public static String STfilepath = "\\src\\main\\resources\\STproperties.properties";
	public static String UATfilepath = "\\src\\main\\resources\\UATproperties.properties";

	public static Properties loadproperties(String env) throws IOException {

		String filepath = "";
		String path = System.getProperty("user.dir");
		System.out.println(path);
		if (env.equals("ST")) {
			filepath = path + STfilepath;
			System.out.println(filepath);
		} else if (env.equals("UAT")) {
			filepath = path + UATfilepath;
			System.out.println(filepath);
		}
		FileReader file = new FileReader(new File(filepath));
		prop = new Properties();
		prop.load(file);
		return prop;
	}

	public static void main(String[] args) throws IOException {
		loadproperties("ST");
	}
}
