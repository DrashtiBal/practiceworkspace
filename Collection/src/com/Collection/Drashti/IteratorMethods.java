package com.Collection.Drashti;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		
		Iterator<Integer> it=a.iterator();
		int r=it.next();
		System.out.println(r);
		
		it.remove();
		System.out.println(r);
		
		System.out.print("Remaining Elements: ");
		while(it.hasNext())
		{
			it.forEachRemaining((val) ->System.out.print(val+","));
		}
	}
}
