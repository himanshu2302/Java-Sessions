package com.java.trainingsessions;

public class MethodSessions {

	//method declaration with access modifier, return type, name, parameters and method definition
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public static void main(String[] args) {
		MethodSessions ms = new MethodSessions();
		
		//method calling and storing return value integer type
		int x = ms.add(10, 20);
		
		//printing the output of method
		System.out.println(x);
		
	}
}
