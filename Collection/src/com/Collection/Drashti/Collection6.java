package com.Collection.Drashti;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collection6 {
	public static void main(String[] args) {
		
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(7);
		al.add(9);
		al.add(8);
		
		System.out.println("Original Array List"+al);
		Collections.sort(al);
		System.out.println("After sort"+al);
		List<Integer> all=al.subList(0, 4);
		System.out.println("After Retrive Substring"+all);
	}
	
}
