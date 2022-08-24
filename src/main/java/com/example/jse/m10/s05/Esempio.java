package com.example.jse.m10.s05;

import java.util.ArrayDeque;

public class Esempio {
	public static void main(String[] args) {
		// metodo che prende una stringa che ritorna true se le parentesi tonde
		// matchano, sennò false (() false )( false

	}

	public static boolean check(String s) {// metodo check
		if (s == null) { // controllo che l'utente abbia messo un argomento buono
			throw new IllegalArgumentException("Devi passarmi una stringa che non sia null");
		}
		ArrayDeque<Character> stack = new ArrayDeque<>();
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur == '(') {
				stack.push(cur);
			} else if (cur == ')') { // cur contiene )
				if (stack.isEmpty()) {
					return false; // le parentesi non matchano correttamente
				} else {
					stack.pop();
				}
			}
		}
		return stack.isEmpty();
	}
}
