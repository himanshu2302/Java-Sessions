package com.java.trainingsessions;

public class Child extends Derived{
	public void add() {
		System.out.println("This is base class add method");
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.add();
		c.subtract();
		c.divide();
		c.add(10, 20);
	}
}
