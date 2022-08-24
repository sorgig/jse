package com.example.jse.m10.s05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EsempioTest {

	@Test
	void check1() {
		String input = "()";
		assertTrue(Esempio.check(input));
	}

	@Test
	void check2() {
		String input = "(((())";
		assertFalse(Esempio.check(input));
	}

	@Test
	void check3() {
		String input = "((()())())";
		assertTrue(Esempio.check(input));
	}

	@Test
	void checkEmpty() {
		String input = "";
		assertTrue(Esempio.check(input));
	}

	@Test
	void checkNull() {
		String input = null;
		try {
			Esempio.check(input);
			fail("attesa eccezione! ");
		} catch (IllegalArgumentException ex) { // dichiarazione di variabile ex che vive solo da 38 a 40
			// ci viene messa l'eccezione che viene generata
			String message = ex.getMessage();
			assertEquals("Devi passarmi una stringa che non sia null", message);
		}
	}
}
