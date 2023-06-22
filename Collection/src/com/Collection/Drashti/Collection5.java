package com.Collection.Drashti;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collection5 {

	public static void main(String[] args) {
		
		ArrayList<String> letters=new ArrayList<String>();
		letters.add("E");  
		letters.add("B");  
		letters.add("A");  
		letters.add("F");          
		letters.add("C");   
		letters.add("G");
		letters.add("D");
		letters.add("G");
		System.out.println("Before"+letters );
		Collections.replaceAll(letters,"A","a");
		System.out.println("After"+ letters);
		Collections.sort(letters);
		Collections.sort(null);
		System.out.println("After sort"+letters);
	
	}
}
