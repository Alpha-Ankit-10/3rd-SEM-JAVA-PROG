/*2b Result of stdudent using Inheritance using method overriding*/

import java.util.*;

class Student
{
	private String name;
	private int roll;
	
	Student()
	{
		name="Ankit";
		roll=524;
	}
	Student(String n,int r)
	{
		name=n;
		roll=r;
	}
	void print()
	{
		System.out.print("Student Name : ");
		System.out.println(name);
		System.out.print("Student Roll: ");
		System.out.println(roll);
	}
}

class Test extends Student
{
	private int mark1,mark2,mark3;
	
	Test()
	{
		super();
		mark1=0;
		mark2=0;
		mark3=0;
	}
	Test(int m1,int m2,int m3)
	{
		mark1=m1;
		mark2=m2;
		mark3=m3;
	}
	void print()
	{
		System.out.println("Student Marks : ");
		System.out.println(mark1+"\n"+mark2+"\n"+mark3+"\n");
	}
}

class Result extends Test
{
	private int total;
	
	Result()
	{
		super();
		total=0;
	}
	
	Result(int m1,int m2,int m3)
	{
		total=m1+m2+m3;
	}
	void print()
	{
		System.out.println("Student Total: "+total+"\n");
	}
}

class StudentPolymerphism
{
    public static void main(String[] args)
	{
		Student ob;
		ob = new Student("Ankit",524);
		ob.print();
		
		ob = new Test(33,44,66);
		ob.print();
		
		ob=new Result(33,44,66);
		ob.print();
		
		Student ob1;
		ob1 = new Student();
		ob1.print();
		
		ob1 = new Test();
		ob1.print();
		
		ob1 = new Result();
		ob1.print();
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java StudentPolymerphism
Student Name : Ankit
Student Roll: 524
Student Marks :
33
44
66

Student Total: 143

Student Name : Ankit
Student Roll: 524
Student Marks :
0
0
0

Student Total: 0
*/