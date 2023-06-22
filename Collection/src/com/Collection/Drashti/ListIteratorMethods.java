package com.Collection.Drashti;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		
		System.out.println("original ArrayList"+a);
		
		ListIterator<Integer> it=a.listIterator();
		it.next();
		//it.next();
		int n1=it.next();
		System.out.println("Next Element :"+n1);
		
		int nextPosition=it.nextIndex();
		System.out.println("position of next element:"+nextPosition);
		
		int n2=it.previous();
		System.out.println("Previous element:"+ n2);
		
		int previousPosition=it.previousIndex();
		System.out.println("Position of Previous element:"+previousPosition);
		
		System.out.println("if there is any element:"+it.hasNext());
	}
}
