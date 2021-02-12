package com.java.coding;

public class Kayar {
	
	int a= 10;
	
	static int b =30;
	
	public static void main(String[] args) {
		
		System.out.println(b);
		Kayar abc = new Kayar();
		//abc.alif();
		
	}
	
	public Kayar(){
		this.a= 500;
		System.out.println("this is in paren class"+a);
	}

}
