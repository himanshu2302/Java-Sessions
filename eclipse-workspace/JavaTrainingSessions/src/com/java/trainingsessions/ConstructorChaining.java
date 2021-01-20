package com.java.trainingsessions;

public class ConstructorChaining {

	public ConstructorChaining() {
		this(10);
	}
	ConstructorChaining(double b){
		this('z');
		System.out.println("Float Constructor" + " "+b);
	}
	ConstructorChaining(int a){
		this(1.34);
		System.out.println("Integer Constructor" + " "+a);
	}

	ConstructorChaining(char c){
		System.out.println("Character Constructor" + " "+c);
	}

	public static void main(String[] args) {
		ConstructorChaining cn = new ConstructorChaining();
	}
}
