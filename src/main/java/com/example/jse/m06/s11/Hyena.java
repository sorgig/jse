package com.example.jse.m06.s11;

public class Hyena implements WaggingBarker, Jumper {

	@Override
	public String bark() {

		return "Hyee Hyee";
	}

	@Override
	public String wag() {

		return "wog wog";
	}

	@Override
	public void jump() {
		System.out.println("My hyena is jumping");

	}

	@Override
	public String toString() {
		return "Hyena []";
	}
	

}
