package com.Collection.Drashti;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayList {

	
	 //Write a program to convert LinkedList to ArrayList
	
	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("drashti");
		ll.add("abc");
		ll.add("ggf");
		ll.add("deg");
		ll.add("bnh");
		ll.add(0,"bbb");
		ll.addFirst("java");
		
		List<String> al=new ArrayList<>(ll);
	
		System.out.println("Array List elements are:");
		for (String string : al) {
			System.out.println(string);
		}
}
}
