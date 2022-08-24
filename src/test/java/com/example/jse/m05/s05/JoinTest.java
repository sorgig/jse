package com.example.jse.m05.s05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JoinTest {

	@Test
	void testJoin() {
		String delimiter = ",";
		String[] values = { "ciao", " bye bye", " hfjsisiejfk", " 35", " 3" };
		String expected = "ciao, bye bye, hfjsisiejfk, 35, 3";
		String actual = Join.join(delimiter, values);
		assertEquals(expected, actual);
	}

}