package com.Collection.Drashti;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//Write a program to sort HashMap by keys 
public class HashSort {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(45,"India");
		map.put(10,"China");
		map.put(13,"USA");
		map.put(80,"UK");
		map.put(63,"Pak");
		map.put(30,"Canada");
		map.put(50, "indonesia");
		TreeMap<Integer, String> tree=new TreeMap<>();
		tree.putAll(map);
		System.out.println(tree);
		for(Map.Entry<Integer, String> e :tree.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}
}
