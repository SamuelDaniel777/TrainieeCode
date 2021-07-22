package com.yash.regexdemo.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching4 {

	public static void main(String[] args) {
		String password="SS2asdfasfd1";
		Pattern p = Pattern.compile("[A-S][0246][a-z A-Z 0-9 $#]*(1)");
		Matcher m = p.matcher(password);
		if (m.find()==true) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
		
	}

}
