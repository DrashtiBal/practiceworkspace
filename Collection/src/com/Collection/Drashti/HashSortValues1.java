package com.Collection.Drashti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashSortValues1 {

	public static void main(String[] args) {
		HashMap<Integer, String> h=new HashMap<>();
		h.put(111, "ffr");
		h.put(778, "dde");
		h.put(556, "aaw");
		h.put(633, "gee");
		h.put(122, "cww");
		
		
		//System.out.println(h);
		h.forEach((k,v)->System.out.println(k+"\t"+v));
		Set<Entry<Integer, String>> entrySet = h.entrySet();
		List<Entry<Integer,String>> l= new ArrayList<>(entrySet);
		Collections.sort(l, new Comparator<Entry<Integer,String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		for (Entry<Integer, String> entry : l) {
			System.out.println(+entry.getKey() +"\t" +entry.getValue());
		}
		System.out.println("Sorted Map By Value");
		//Iterator<E>
		l.forEach(s->{System.out.println(s.getKey()+"\t"+s.getValue());
		});
		}
	}

