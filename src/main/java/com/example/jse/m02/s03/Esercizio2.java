package com.example.jse.m02.s03;

import java.util.Arrays;

public class Esercizio2 {
	public static void main(String[] args) {
		int[] a = { 5, 7, 9, 11, 6 };
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			a[i]--;
		}
		System.out.println(Arrays.toString(a));
	}
}
