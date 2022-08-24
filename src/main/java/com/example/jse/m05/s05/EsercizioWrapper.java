package com.example.jse.m05.s05;

public class EsercizioWrapper {
	// passata una stringa ritorna quante cifre ci sono
	public static int countCipher(String s) {
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				counter++;
			}
		}
		return counter;
	}

	// passata una stringa ritorna quanti char ci sono
	public static int countAlpha(String s) {
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isAlphabetic(c)) {
				counter++;
			}
		}
		return counter;
	}

}
