package com.jahid.smarttech;

public class ForLoopDemo {

	public static void main(String[] args) {
		int i;
		for(i=0;i<=10;i++) {
			System.out.println("Ans One: "+i);
		}
		
		int j;
		for(j=10;j>=0;j--) {
			System.out.println("Ans Two: "+j);
		}
		
		int k;
		for(k=1;k<=10;k+=2) {
			System.out.println("Ans Three: "+k);
		}
		
		int a=0;
		while(a<=4) {
			System.out.println("Ans four: "+a);
			a++;
			
		}
		
		int b=0;
		while(b<=10) {
			System.out.println("Ans five: "+b);
			b++;
			
		}
		
		int c=10;
		while(c>=0) {
			System.out.println("Ans six: "+c);
			c--;
			
		}
		
		int d=10;
		while(d>0) {
			System.out.println("Ans six: "+d);
			d--;
			
		}

	}

}
