package com.jahid.smarttech;

public class StaticVsInstance {
	
	static int abc= 10;
	 int xyz =20;
	
	
	
	

	
	void apple(){
		System.out.println(abc);
		System.out.println(xyz);
	}
	
	static void orange(){
		System.out.println(abc);
		
	}
	
	public static void main(String[] args) {
		StaticVsInstance mango = new StaticVsInstance();
		mango.apple();
		
		orange();
	}
	
	

	

}
