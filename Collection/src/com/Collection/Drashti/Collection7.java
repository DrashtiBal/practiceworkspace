package com.Collection.Drashti;

import java.util.ArrayList;

public class Collection7 {
public static void main(String[] args) {
	
	ArrayList<Integer> al =new ArrayList<Integer>();
	ArrayList<Integer> bl= new ArrayList<Integer>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(1);
	al.add(7);
	al.add(9);
	al.add(8);
	al.add(7);
	al.add(9);
	al.add(8);
	al.add(7);
	al.add(9);
	al.add(8);
	bl.add(10);
	bl.add(11);
	bl.add(12);
	bl.add(13);
	bl.add(14);
	bl.add(15);
	bl.add(8);
	al.ensureCapacity(6);
	System.out.println(al);
	ArrayList<Integer> s1=(ArrayList)al.clone();
	System.out.println("Cloned"+s1);
	System.out.println(al.size());
	System.out.println(bl);
	System.out.println(al.addAll(bl));
	for (Integer i : al) {
		System.out.println(i);
	}
	System.out.println(al.retainAll(bl));
	System.out.println(al);
	/*
	 * bl.add(0); bl.add(0); bl.add(0); bl.add(0); bl.add(0); bl.add(0);
	 */
	System.out.println(bl.size());
	//bl.trimToSize();
	//System.out.println("After trim"+bl);
	
	//System.out.println(al);
	
	
}
}
