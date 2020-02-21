package com.jahid.smarttech;

import javax.sound.midi.Soundbank;

public class Variable_Types {
	static int myAccountBalance;

	public static void main(String[] args) {
		myAccountBalance =99;
		
		if(myAccountBalance>100 & myAccountBalance<1000) {
			System.out.println("You dont have enough money");
		}
		else if(myAccountBalance<=99) {
			System.out.println("You are Homeless");
		}
		else {
			System.out.println("You have enough money");
		}

	}

}
