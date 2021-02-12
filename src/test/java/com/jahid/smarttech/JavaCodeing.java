package com.jahid.smarttech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class JavaCodeing {

	public static void main(String[] args) {
		String abc = "united states of america";
		
		char[] xyz = abc.toCharArray();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i= 0; i <= abc.length()-1; i++) {
			if(map.containsKey(xyz[i])) {
				map.put(xyz[i], map.get(xyz[i])+1);
			}
			else {
				map.put(xyz[i], 1);
			}
		}
				
		for(int i=0;i<=abc.length();i++) {
			if(map.containsValue(1)) {
				map.remove(xyz[i], 1);
			}
		}
		
		System.out.println(map);
		
	}	

}
