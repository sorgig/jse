package com.example.jse.m02.s12.ex;

public class Esercizio5 {
	public static void main(String[] args) {
		int[] numbers = { 27, 18, 25, 6, 8, -8, -7, 66, 9 };
		int result = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > result) {
				result = numbers[i];
			}

		}
		System.out.println(result);

	}

}
