package com.Collection.Drashti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class LambdaExp {

public static void main(String[] args) {
		
		ArrayList<Integer> l1=new ArrayList<Integer>();
		
		l1.add(214);
		l1.add(544);
		l1.add(433);
		l1.add(045);
		l1.add(136);
		l1.add(9);
		l1.add(7);
		l1.add(6);
		
		Comparator<Integer> c= (o1,o2)->
		{
			if(o1%100<o2%100)
				
				return 0;
				return -1;
		};
		Collections.sort(l1, c);
		//System.out.println();
		Iterator<Integer> iterator =l1.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}

