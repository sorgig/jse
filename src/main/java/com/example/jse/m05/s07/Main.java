package com.example.jse.m05.s07;

public class Main {
	public static void main(String[] args) {
		Dog tom = new Chihuahua();
		tom.bark();
		System.out.println("-----------------------");
		Dog[] dogs = { new Chihuahua(), new Dog(), new Poodle(), new ChihuahuaMini() };
		for (Dog dog : dogs) { // for each
			dog.bark();
		}
		System.out.println("-----------------------");
		for (int i = 0; i < dogs.length; i++) {
			dogs[i].bark();
		}
	}
}
