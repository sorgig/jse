package com.example.jse.m10.s08;

import java.util.TreeSet;

public class Esercizio {
	public static String[] organize(String[] names) {
		TreeSet<String> temp = new TreeSet<>();
		for (int i = 0; i < names.length; i++) {
			temp.add(names[i]);
		}
		String[] result = new String[temp.size()];
		return temp.toArray(result);
	}

}
