package com.Collection.Drashti;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {

	public static void main(String[] args) {
		
		HashSet<Integer> h1 =new HashSet<Integer>();
		
		 h1.add(1); h1.add(2); h1.add(3); h1.add(4); h1.add(5); h1.add(6);
		 
		System.out.println(h1.size());
		//Contains or not
		
		 if(h1.contains(2)) { System.out.println("set contains"); }
		 if(!h1.contains(7)) { System.out.println("does not contains"); }
		Iterator i=h1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
