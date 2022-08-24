package com.example.jse.m05.s03.ex;

public class Esercizio {
	public static String valueOf(int number) {
		if (number == 0) {
			return "0";
		}
		boolean isNegative = number < 0;
		if (isNegative) {
			number = Math.abs(number);
		}
		StringBuilder result = new StringBuilder();
		while (number != 0) {
			int cifra = number % 10;
			result.append(cifra);
			number /= 10;
		}
		if (isNegative) {
			result.append('-');
			result.reverse();
		}
		return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(valueOf(35721));
		System.out.println(valueOf(0));
		System.out.println(valueOf(-518));
	}

}
