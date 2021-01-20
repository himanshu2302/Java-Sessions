package com.java.trainingsessions;

public class TestClass {
	public static void main(String[] args) {

		SBI sbi = new SBI();
		ICICI icici = new ICICI();
		HDFC hdfc = new HDFC();
		sbi.interestRate(10);
		icici.interestRate(14);
		hdfc.interestRate(8);
	}
}

//inherited method should have same signature as Parent class method to override

class ICICI extends Bank{
	public int interestRate(int f) {
		System.out.println("Interest rate of : "+ f);
		return f;
	}
}

class SBI extends Bank{
	public int interestRate(int f) {
		System.out.println("Interest rate of : "+ f);
		return f;
	}
}

class HDFC extends Bank{
	public int interestRate(int f) {
		System.out.println("Interest rate of : "+ f);
		return f;
	}
}
