package com.java.programs;

import java.util.Scanner;

public class StringReverse {

	
	public void reverseString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.next();
		char[] s2 = str.toCharArray();
		String s1="";
		for(int i=0;i<s2.length;i++) {
			s1=s1+s2[s2.length-i-1];
		}
		System.out.println("Reverse String: " +s1);
		if(str.equals(s1)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
	}
	public static void main(String[] args) {
		StringReverse sr = new StringReverse();
		sr.reverseString();
	}
}
