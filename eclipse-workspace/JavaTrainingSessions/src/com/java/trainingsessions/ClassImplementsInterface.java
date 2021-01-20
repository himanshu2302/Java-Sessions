package com.java.trainingsessions;

public class ClassImplementsInterface implements FirstInterface, SecondInterface {

	@Override
	public void colourChange() {
		System.out.println("This is implementation of first interface method");

	}

	@Override
	public void breakingSystem() {
		System.out.println("This is implementation of second interface method");

	}

	@Override
	public void engineStart() {
		System.out.println("This is implementation of second interface method");

	}
//	public static void main(String[] args) {
//		ClassImplementsInterface c = new ClassImplementsInterface();
//		c.breakingSystem();
//		c.engineStart();
//		c.colourChange();
//	}

}
