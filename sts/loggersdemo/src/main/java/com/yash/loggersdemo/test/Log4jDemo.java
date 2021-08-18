package com.yash.loggersdemo.test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jDemo {
	
//	public static void sub() {
//		System.out.println(10/0);
//	}
	
	public static void main(String[] args) {
		Logger logger= Logger.getLogger(Log4jDemo.class); 
		PropertyConfigurator.configure("log.properties");
		logger.debug("debug");
		logger.warn("warn");
		logger.fatal("fatal");
//		sub();
	}

}
