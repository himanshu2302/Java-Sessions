package com.java.trainingsessions;

public class Addition {
	public int add(int a, int b) {
		int c = a +b;
		return c;
	}
	public static void main(String[] args) {
		Addition ad = new Addition();
		int d = ad.add(10, 20);
		System.out.println("Hello Anshu");
		System.out.println("Addition of a and b is : "+d);
	}
}
