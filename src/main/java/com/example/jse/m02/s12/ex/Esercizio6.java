package com.example.jse.m02.s12.ex;

public class Esercizio6 {
	public static void main(String[] args) {
		int[] array = { 4, 7, 14, 22, 31, 83 };
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		System.out.println(result);
	}

}
