package com.Collection.Drashti;

import java.util.Vector;

public class Collection10 {

	public static void main(String[] args) {
		
		Vector<String> v= new Vector<String>(20);

		v.add("A"); v.add("B");  v.add("C"); 
		v.add("D");
		Vector<String> v1= new Vector<String>();
		
		 v1.add("A"); v1.add("B"); v1.add("C");
		 
		v1.add("D");
		 
		System.out.println("Is vector1 equals vector2 ? "+v.equals(v1));
		System.out.println("Hashcode is "+v.hashCode());
		
	}
}
