package com.example.jse.m02.s05;

public class Esercizio {
	public static void main(String[] args) {
		int[] array = { 2, 5, 7, 8, 7, 9, 7 };
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 7) {
				counter++;
			}
		}
		System.out.println("I sette sono " + counter + "!");

		int counter2 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 3) {
				counter2++;
			}
		}
		System.out.println("ci sono: " + counter2 + " tre!");
	}
}
