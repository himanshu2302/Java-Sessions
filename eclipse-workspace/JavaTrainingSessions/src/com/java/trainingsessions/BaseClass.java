package com.java.trainingsessions;

abstract class BaseClass implements FirstInterface, SecondInterface{
	int a;

	@Override
	public void colourChange() {
		// TODO Auto-generated method stub

	}
}
class New extends BaseClass{
	public void add() {
		System.out.println("This is abstract method of Abstract class");
	}
	@Override
	public void engineStart() {

	}




	@Override
	public void breakingSystem() {
		// TODO Auto-generated method stub

	}
}
