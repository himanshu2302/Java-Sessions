package com.java.trainingsessions;

public class StaticPolymorphism {
	public static void main(String[] args) {
		Base b = new Der();
		b.state();

	}
}

class Base{
	static void state() {
		System.out.println("This is base class method");
	}
}

class Der extends Base{
	static void state() {
		System.out.println("This is derived class method");
	}
}
