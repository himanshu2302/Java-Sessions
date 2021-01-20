package com.java.trainingsessions;

public class Maths {
	public static void main(String[] args) {
		One o = new Tow();
		Tow t = new Tow();
		Tow t1 = new Tow();
		o.calculate(25);	
		t.c=10;
		t1.c=20;
	}
}
class One{
	static void calculate(double x) {
		System.out.println("square value :"+(x*x));
		
	}
}

class Tow extends One{
	static int c;
	final int  a=10;
	final static int b=20;
	static void calc(double x) {
		System.out.println("square root :"+Math.sqrt(x));
	}

}
