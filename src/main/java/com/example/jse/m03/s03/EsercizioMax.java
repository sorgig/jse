package com.example.jse.m03.s03;

public class EsercizioMax {
	public static double max(double[] array) {
		// double result = -Double.MAX_VALUE;
		double result = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > result) {
				result = array[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		double[] values = { 1.3, 16.9, 17826.9, 9.9 };
		double max = max(values);
		System.out.println(max);
	}
}
