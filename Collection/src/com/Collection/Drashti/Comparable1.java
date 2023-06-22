package com.Collection.Drashti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a program to sort ArrayList usingComparable
class Stu implements Comparable<Stu>
{
	int marks,rollno;
	String name;
	public Stu(int rollno, int marks, String name) {
		super();
		this.marks = marks;
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stu [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Stu o) {
		
		return rollno>o.rollno?1:-1;
	}
	
}
public class Comparable1 {

	public static void main(String[] args) {
	
		List<Stu> st=new ArrayList<>();
		st.add(new Stu(1,40,"abc"));
		st.add(new Stu(2,30,"abd"));
		st.add(new Stu(3,70,"aba"));
		st.add(new Stu(4,10,"abb"));
		
		Collections.sort(st);
		for (Stu student : st) {
			System.out.println(student);
		}
	}
	}
	

