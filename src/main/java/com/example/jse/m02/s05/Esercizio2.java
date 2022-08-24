package com.example.jse.m02.s05;

import java.util.Arrays;

public class Esercizio2 {
	public static void main(String[] args) {
		int[] a = { 2, 8, 6, 2, 7 };
		System.out.println(Arrays.toString(a));
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
				counter++;
			}
		}
		System.out.println(counter);
	}
}
