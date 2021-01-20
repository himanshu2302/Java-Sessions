package com.java.trainingsessions;

public class MethodOverloading {

	//concept of method overloading and dynamic binding and dynamic polymorphism and late binding.
	public int add(int a, int b) {
		int c= a+b;
		return c;
	}

	public int add(int a, int b, int c) {
		int d=a+b+c;
		return d;
	}
	//JVM will decide which method should be called at runtime thats why it is called late binding. here complier will not decide.
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		int sum = mo.add(10, 20, 30);
		System.out.println(sum);
	}
}
