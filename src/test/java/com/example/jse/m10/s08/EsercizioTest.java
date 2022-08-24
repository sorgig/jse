package com.example.jse.m10.s08;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class EsercizioTest {

	@Test
	void testOrganize() {
		String[] input = { "Harry", "Tom", "Hermione", "Ron", "Sirius", "Harry", "Tom"};
		String[] expected = { "Harry", "Hermione", "Ron", "Sirius", "Tom" };
		String[] actual = Esercizio.organize(input);
		assertThat(actual).isEqualTo(expected);

	}

}
