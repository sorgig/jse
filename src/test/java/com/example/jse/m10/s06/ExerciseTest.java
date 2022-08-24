package com.example.jse.m10.s06;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;

class ExerciseTest {

	@Test
	void testSingles() {
		int[] input = { 2, 56, 2, 8, 30 };
		int[] expected = { 2, 56, 8, 30 };
		int[] actual = Exercise.singles(input);
		assertThat(actual).containsAnyOf(expected);
	}

	@Test
	void testSingles1() {
		int[] input = { 2, 2, 2, 2, 2 };
		int[] expected = { 2 };
		int[] actual = Exercise.singles(input);
		assertThat(actual).containsAnyOf(expected);
	}

	@Test
	void testSingles2() {
		int[] input = { 2, 2, 2, 2, 2 };
		Integer[] expected = { 2 };
		Integer[] actual = Exercise.singles2(input);
		assertThat(actual).containsAnyOf(expected);
	}

}
