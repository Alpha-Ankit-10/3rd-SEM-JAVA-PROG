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
		System.out.println();
		DemoStudent ob1 = new DemoStudent();//Object created
		ob1.input();
		ob1.display();
		System.out.println();
		
		//object can be created in array format to create multiple response
		
	}
}