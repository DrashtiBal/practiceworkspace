package com.Collection.Drashti;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet1 {
public static void main(String[] args) {
	
	int a[]= {1,4,2,0,7};
	TreeSet<Integer>s= new TreeSet<Integer>();
	
	//Collections.addAll(s,a);
	for (Integer i : a) {
		
		s.add(i);
	}
	System.out.println(s);
	
	System.out.println("first:"+s.first());
	System.out.println("last:"+s.last());
	System.out.println("Ceiling:"+s.ceiling(4));
	System.out.println("floor:"+s.floor(3));
	System.out.println("Higher"+s.higher(1));
	System.out.println("lower:"+s.lower(2));
	System.out.println("pollFirst:"+s.pollFirst());
	System.out.println("pollLast:"+s.pollLast());
	System.out.println("isEmpty:"+s.isEmpty());
	System.out.println("subSet:"+s.subSet(0,7));
	Iterator<Integer> it=s.descendingIterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}	
}
}
