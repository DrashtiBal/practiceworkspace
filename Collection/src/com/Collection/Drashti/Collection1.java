package com.Collection.Drashti;

import java.util.ArrayList;
//Write a program to add element at particular index of ArrayList
public class Collection1 {

	public static void main(String[] args) {
		
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("1");
		l1.add("2");
		l1.add("3");
		l1.add("4");
		l1.add("5");
		System.out.println(l1.isEmpty());
		l1.add(2,"6");
		System.out.println(l1);
	}
}
