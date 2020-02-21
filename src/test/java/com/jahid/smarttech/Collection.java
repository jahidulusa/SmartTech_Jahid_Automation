package com.jahid.smarttech;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection {

	public static void main(String[] args) {
		
		int[] apple= new int[3];
		
		apple[0]=75;
		apple[1]=34;
		apple[2]=56;
		
		for(int abc:apple) {
			System.out.println("The value of apple is: "+abc);
			
		}
		
		String[] you= new String[3];
		
		you[0]="Love yourself";
		you[1]="Alive is awesome";
		you[2]="Be in Present";
		
		for (int i=0;i<you.length;i++) {
			System.out.println(you[i]);
		}
		
		ArrayList<String> arrlistobj=new ArrayList<String>();
		
		arrlistobj.add("Alive is awesome");
		arrlistobj.add("Love youself");
		arrlistobj.add("I love Java");
		
		for (int i=0; i<arrlistobj.size();i++) {
			System.out.println("ArrayList Example"+arrlistobj.get(i));
		}
		
		HashMap<String,String> map=new HashMap<String, String>();
		
		map.put("Tom","4564579807");
		map.put("Sam","8070982365");
		map.put("Molly","6750985674");
		
		System.out.println(map);
		System.out.println("This is Molly's number "+map.get("Molly"));
		

	}

}
