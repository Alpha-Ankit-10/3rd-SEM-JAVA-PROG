/*Demonstration of class and object*/

import java.util.*;

class DemoStudent
{
	String name;
	float mark;
	int age;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name :");
		name=sc.next();
		System.out.println("Enter Mark :");
		mark=sc.nextFloat();
		System.out.println("Enter Age :");
		age=sc.nextInt();
	}
	void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Mark :"+mark);
		System.out.println("Age :"+age);
	}
}
class Student
{
	public static void main(String args[])
	{
		DemoStudent ob = new DemoStudent();//Object created
		ob.input();
		ob.display();
		
		DemoStudent ob1 = new DemoStudent();//Object created
		ob1.input();
		ob1.display();
	}
}

/*
		ob.name = "ANkit";
		ob.mark = 9.5f;
		ob.age = 22;
		System.out.println("Name :"+ob.name);
		System.out.println("Mark :"+ob.mark);
		System.out.println("Age :"+ob.age);
		ob1.name = "Shreeya";
		ob1.mark = 8.5f;
		ob1.age = 18;
		System.out.println("Name :"+ob1.name);
		System.out.println("Mark :"+ob1.mark);
		System.out.println("Age :"+ob1.age);
*/