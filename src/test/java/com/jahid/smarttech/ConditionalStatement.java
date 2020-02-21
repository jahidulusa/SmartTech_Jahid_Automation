package com.jahid.smarttech;

public class ConditionalStatement {
	static int score =85;
	static String grade;

	public static void main(String[] args) {
		
		
		
		if (score >90) {
			grade= "A";
		}
		else if (score > 80) {
			grade= "B";
		}
		else {
			grade="C";
		}
		
		System.out.println("Score is: "+ score);
		System.out.println("Grade is: "+ grade);

	}

}
