package com.Collection.Drashti;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection3 {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"aaa",555555555);
		Student s2=new Student(2,"bbb",555555555);
		Student s3=new Student(3,"ccc",555555555);
		
		ArrayList<Student> a1= new ArrayList<Student>();
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		Iterator<Student> itr=a1.iterator();
		while(itr.hasNext())
		{
			//Object Student;
			Student s=(Student)itr.next();
			System.out.println(s.rollno+" "+s.name+" "+s.contact);
		}
		}
}
class Student
{
	int rollno;
	String name;
	int contact;
	
	Student(int rollno,String name,int contact)
	{
		this.rollno=rollno;
		this.name=name;
		this.contact=contact;
	}

}
