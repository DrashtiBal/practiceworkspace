package com.Collection.Drashti;

import java.util.HashMap;
import java.util.Map;

public class HMap {

	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<>();
		map.put("India","100");
		map.put("China","90");
		map.put("USA","80");
		map.put("UK","70");
		map.put("Pak","60");
		map.put("Canada","50");
		System.out.println(map);
		map.put("China", "110");
		System.out.println(map);
		for(Map.Entry<String, String> e :map.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}
} 
