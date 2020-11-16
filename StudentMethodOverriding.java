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
	Test(String n,int r,int m1,int m2,int m3)
	{
		super(n,r);
		mark1=m1;
		mark2=m2;
		mark3=m3;
	}
	void print()
	{
		super.print();
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
	
	Result(String n,int r,int m1,int m2,int m3)
	{
		super(n,r,m1,m2,m3);
		total=m1+m2+m3;
	}
	void print()
	{
		super.print();
		System.out.println("Student Total: "+total);
	}
}

class StudentMethodOverriding
{
    public static void main(String[] args)
	{
		Result ob =new Result("Ankit",524,33,44,66);
		ob.print();
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java StudentInheritance
Student Name : Ankit
Student Roll: 524
Student Marks :
33
44
66

Student Total: 143
*/