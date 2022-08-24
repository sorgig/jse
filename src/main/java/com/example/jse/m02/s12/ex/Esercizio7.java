package com.example.jse.m02.s12.ex;

public class Esercizio7 {
	public static void main(String[] args) {
		int[] array = { 9, 5, 0, -2, -5 };
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0) {
				counter++;
			}
		}
		System.out.println("Ci sono " + counter + " numeri positivi");
	}

}
