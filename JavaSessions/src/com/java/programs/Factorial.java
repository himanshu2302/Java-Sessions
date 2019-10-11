package com.java.programs;

import java.util.Scanner;

public class Factorial {
	
	public void factorial() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int a=sc.nextInt();
		int b=a;
		int n=1;
		for(int i=1;i<=b;i++) {
			
			n=n*a;
			a--;
		}
		System.out.println("Factorial: " + n);
	}
public static void main(String[] args) {
	Factorial fc = new Factorial();
	fc.factorial();
}
}
