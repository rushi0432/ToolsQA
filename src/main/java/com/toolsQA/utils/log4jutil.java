package com.toolsQA.utils;

import org.apache.log4j.Logger;

public class log4jutil {

	static Logger Log = Logger.getLogger(log4jutil.class.getName());

	public static void main(String[] args) {
		Log.info("test 1");
		Log.error("error message");
	}
}
