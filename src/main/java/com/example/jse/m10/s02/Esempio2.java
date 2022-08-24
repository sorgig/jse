package com.example.jse.m10.s02;


import java.util.LinkedList;
import java.util.List;

public class Esempio2 {
	public static void main(String[] args) {
		List<Integer> nums = new LinkedList<>(List.of(47, -2, 6, 8, -14));
		System.out.println(nums);
		nums.remove(0);
		System.out.println(nums);
		nums.add(nums.size() / 2, 13);
		System.out.println(nums);
		nums.set(3, 51); // togli il valore precedente in quella posizione e metticene un'altro
		System.out.println(nums);
		int pos = nums.indexOf(51);
		System.out.println(pos);
	}

}
