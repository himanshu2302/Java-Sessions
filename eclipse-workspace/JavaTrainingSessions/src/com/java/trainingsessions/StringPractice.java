package com.java.trainingsessions;

public class StringPractice {
	public static void main(String[] args) {

		char arr[] = {'c','h','a','i','r','s'};

		//converting character array into string object
		String s = new String(arr);
		System.out.println("String s is : "+s);

		String s1 = new String(arr, 2, 3);
		System.out.println("String s1 is : "+s1);

		//length() is used to get the length of the String
		int length = s1.length();
		System.out.println("length of s1 is : "+length);

		//charAt(int) method used to get the character at certain index number of string
		System.out.println("Character at index 4 of s is : "+s.charAt(5));

		String s3 = "never";
		String s4 = "always";

		//compareTo() method is used to compare 2 string that which is bigger
		System.out.println("Bigger string is : "+s4.compareTo(s3));

		String name = "himanshu";

		//comparing the string starts with
		boolean b = name.startsWith("a", 3);
		System.out.println(b);

		//comparing the string ends with
		boolean c = name.endsWith("u");
		System.out.println(c);

		String s5 = "   My name is Himanshu    ";
		String s6 = "s";

		//finding the index of the sub string in main string
		int indexOf = s5.indexOf(s6);
		System.out.println("Index of s6 in s5 is : "+indexOf);

		//finding last index of sub string in main string
		int indexOf2 = s5.lastIndexOf(s6);
		System.out.println("Last index of s6 in s5 is : "+indexOf2);


		//returns the sub string out of main string starting from given index
		String substring = name.substring(3);
		String substring2 = name.substring(3, 7);
		System.out.println("Substring of name is : "+substring);
		System.out.println(substring2);

		//removing space from string s5 at staring and ending of the String
		String trim = s5.trim();
		System.out.println("New string s5 is :"+trim);

	}
}
