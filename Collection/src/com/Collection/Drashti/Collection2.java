package com.Collection.Drashti;

import java.util.ArrayList;

public class Collection2 {

	public static void main(String[] args) {
		
	ArrayList<String> l1=new ArrayList<String>();
	
	l1.add("a");
	l1.add("b");
	l1.add("c");
	l1.add("d");
	l1.add("e");
	l1.add("f");
	System.out.println("Retrive Element"+l1.get(1));
	l1.set(0, "b");
	 for (String A : l1) { System.out.println(A); }
	//System.out.println(l1);
	
	}
}
