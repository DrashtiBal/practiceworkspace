package com.Collection.Drashti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayToArrayList {

	
	public static void main(String[] args) {
	
		String a[]= {"abcdefg"};
		int b[]= {1,2,3,4,5};
		ArrayList<String> a1=new ArrayList<String>();
		Collections.addAll(a1,a);
		System.out.println(a1);
		
		List<String> b1=Arrays.asList(a);
		System.out.println(b1);
		
		List<Integer>d=new ArrayList<Integer>();
		for (Integer c : b) {
			d.add(c);
		}
		System.out.println(d);
		Object array1[]=d.toArray();
		System.out.println("the array elements are: ");
		for (Object object : array1) {
			System.out.println(object);
		}
		Comparator co=Collections.reverseOrder();
		Collections.sort(d,co);
		System.out.println(d);
	}
	}
