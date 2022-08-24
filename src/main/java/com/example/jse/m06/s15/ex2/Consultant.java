package com.example.jse.m06.s15.ex2;

public class Consultant extends Person {
	private int fee;

	public Consultant(String firstName, String lastName, int fee) {
		super(firstName, lastName);
		this.fee = fee;

	}
	

	public int getFee() { //getter per rendere disponibilie proprietà fee
		return fee;
	}


	@Override
	public String toString() {
		return "Consultant [fee=" + fee + "] " + super.toString();
	}
	

}
