package com.Collection.Drashti;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeHashMap {

	public static void main(String[] args) {
		TreeMap<Integer,String> t=new TreeMap<>(Comparator.reverseOrder());
		t.put(11, "jfgjdsf");
		t.put(19,"jhfjjs");
		t.put(14, "hjehf");
		t.put(10, "abc");
		System.out.println(t);
		
		System.out.println(t.lastKey());
		System.out.println(t.firstKey());
		
		System.out.println(t.headMap(14).keySet());
		System.out.println(t.tailMap(11).keySet());
		
	}
}
