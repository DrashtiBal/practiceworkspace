package com.Collection.Drashti;

import java.util.Vector;

public class Collection12 {

	 public static void main(String arg[]) {   
	        Vector<Integer> vec = new Vector<Integer>(4);                         
	        vec.add(1);  
	        vec.add(2);  
	        vec.add(3);  
	        vec.add(4);  
	        vec.add(5);  
	        //Convert the contents into string  
	        vec.toString();  
	          //Display the contents of a vector  
	        System.out.println("An elements in vector are :- ");            
	        for (Integer number : vec) {           
	            System.out.println("Number = " + number);  
	        }          
	      }  
}
