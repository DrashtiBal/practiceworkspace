package com.Collection.Drashti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSync {

	//How to synchronize an ArrayList in java
	static List<Integer> list=new ArrayList<Integer>();
	public static void main(String[] args) {
		list.add(1);
		list.add(4);
		list.add(0);
		list.add(15);
		list.add(6);
		list.add(9);
		list.remove(3);
		System.out.println(list);
		list = Collections.synchronizedList(list);
		
		//System.out.println();
		 synchronized (ArrayListSync.list) {
		      Iterator i = list.iterator(); // Must be in synchronized block
		      while (i.hasNext()) {
		    	  System.out.println(i.next());
		    	 //list.add(10);
		      }
		     // System.out.println(i.next());
		 } 
	}
	}
