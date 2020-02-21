package com.jahid.smarttech;

public class Car {
	private String make;
	int speed;
	int gear;
	
	public Car() {
		this.speed= 0;
		this.gear = 0;
		System.out.println("Executing constructor without argument");
	}
	
	//"this" refers to the instance of the class(object)
	public void setMake(String make) {}

}
