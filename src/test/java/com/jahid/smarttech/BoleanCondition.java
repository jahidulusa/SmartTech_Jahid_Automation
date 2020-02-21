package com.jahid.smarttech;

public class BoleanCondition {
	static Boolean objectBoolean; //this is a class variable
	static boolean primitiveBoolean;
	public boolean a; //this is an instance variable
	
	
	public static void apple() {
		boolean b = true; //this is a local variable
		if (b) {
			System.out.println("I am rich apple");
		} else {
			System.out.println("I am homeless apple");
		}
	}
	
	public void orange() {
		if (a) {
			System.out.println("I am rich orange");
		} else {
			System.out.println("I am homeless orange");
		}
	}

	public static void main(String[] args) {

		System.out.println(objectBoolean); // will print 'null'
		System.out.println(primitiveBoolean); // will print 'false'

		apple();
		
		BoleanCondition obj = new BoleanCondition();
		obj.orange();

	}

}
