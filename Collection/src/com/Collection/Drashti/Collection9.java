package com.Collection.Drashti;

import java.util.Vector;

public class Collection9 {
public static void main(String[] args) {
		
	Vector<String> v= new Vector<String>();
	v.add("A");
	v.add("B");
	v.add("C");
	v.add("D");
	v.add("E");
	v.add("F");
	v.add("G");
	v.add("H");
	v.add("I");
	
	System.out.println(v);
	System.out.println(v.capacity());
	v.add("j");
	v.add("k");
	System.out.println(v);
	System.out.println(v.capacity());
	}
}
