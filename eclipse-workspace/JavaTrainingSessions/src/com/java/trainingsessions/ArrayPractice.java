package com.java.trainingsessions;

public class ArrayPractice {
	public static void main(String[] args) {

		char [] c = new char[5];
		c[0] = 'a';
		c[1] = 'n';
		c[2] = 's';
		c[3] = 'h';
		c[4] = 'u';

		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}

		String s = new String(c);
		System.out.println(s);

		String s1 = "himanshu";

		//toCharArray() is used to convert string into character array
		char [] d = s1.toCharArray();

		for(int i=0;i<s1.length();i++) {
			System.out.println(d[i]);
		}



	}
}
