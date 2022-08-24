package com.example.jse.m05.s05;

public class Join {
	public static String join(String delimiter, String[]elements) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < elements.length - 1; i++) {
			result.append(elements[i]);
			result.append(delimiter);
		}
		result.append(elements[elements.length - 1]);
		return result.toString();
	}
 
}
