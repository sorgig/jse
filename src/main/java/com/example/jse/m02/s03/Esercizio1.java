package com.example.jse.m02.s03;

import java.util.Arrays;

public class Esercizio1 {
	public static void main(String[] args) {
		int[] array = { 2, 4, 6, 8};
		System.out.println(Arrays.toString(array));
		for  (int i = 0; i < array.length; i++) {
			array[i] += 1; 
		}
		System.out.println(Arrays.toString(array));
	}
}