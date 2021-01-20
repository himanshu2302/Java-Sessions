package com.java.trainingsessions;

public class CallByValue {

	public static void Example(int x, int y) {
		x++;
		y++;
	}

	public static void main(String[] args) {
		CallByValue cv = new CallByValue();
		int a=10;
		int b=20;
		System.out.println("Value of a is: " +a+ " and b is : "+b);
		CallByValue.Example(a, b);
		System.out.println("Value of x is: "+a+ " and y is: "+b );
	}
}

