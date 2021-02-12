package com.jahid.smarttech;

public class LoopingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] abc = new String[5];
		
		abc[0] = "this is a test";
		abc[1] = "Smarttech class nine";
		abc[2] = "Happy new year";
		abc[3] = "hello java";
		abc[4] = "Why is everyone so quite";
		
		for(int i=0; i<=abc.length-1; i++) {
			System.out.println(abc[i]);
		}

	}

}
