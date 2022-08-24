package com.example.jse.m05.s05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EsercizioWrapperTest {

	@Test
	void testCountCipher() {
		String input = "Ciao 199";
		int expected = 3;
		int actual = EsercizioWrapper.countCipher(input);
		assertEquals(expected, actual);
	}

	@Test
	void testCountAlpha() {
		String input = "Ciao 199";
		int expected = 4;
		int actual = EsercizioWrapper.countAlpha(input);
		assertEquals(expected, actual);
	}

}
