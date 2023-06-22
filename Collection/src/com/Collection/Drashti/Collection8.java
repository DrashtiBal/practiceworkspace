package com.Collection.Drashti;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection8 {
	public static int count=1;
public static void main(String[] args) {
	Collection<Character> a1=new ArrayList<Character>();
	for (char i = 'A'; i <='Z'; i++) {
		a1.add(i);
	} 
	Character ch = new Character((char) a1.size());
	Object[] array = a1.toArray();
	
	for (Object object : array) {
		System.out.println(object);
	}
	
	//a1.toArray(new Character(a1.size()));
	//Character a=new Character((char) a1.size());
//	a=a1.toArray();
//	for(int i=0;i<a1.length;i++)
//	{
//		System.out.println("Element" +count++ +"::"+o[i]);
//	}
	
}
}
