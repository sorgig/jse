package com.example.jse.m02.s07;

public class Esercizio {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("You passed me nothing");
			return;
		} else if (args[0].length() < 5) {
			System.out.println("String is too short");
		} else if (args[0].length() == 5) {
			System.out.println("The lenght is exactly 5");
		} else {
			System.out.println("The strings you passed me are: ");
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}

	}
}
