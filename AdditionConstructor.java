/*Q1b Addition of two numbers using constructor*/

import java.util.*;

class Add
{
	int number;
	
	Add() //Default Constructor
	{
		//Always required when paramertized constructor is given
	}
	Add(int no) //Parametrized Constructor
	{
		number=no;
	}
	void addition(Add ob1,Add ob2)
	{
		number=ob1.number+ob2.number;
	}
	void show()
	{
		System.out.println("Result = "+number);
	}
}

class AdditionConstructor
{
	public static void main(String args[])
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st integer:");
		num1=sc.nextInt();
		System.out.println("Enter 2nd integer:");
		num2=sc.nextInt();
		
		//Object creatation
		Add ob1 = new Add(num1);
		Add ob2 = new Add(num2);
		Add ob3 = new Add();
		
		//Addition
		ob3.addition(ob1,ob2);
		
		//Displaying result
		ob3.show();				
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java AdditionConstructor
Enter 1st integer:
52
Enter 2nd integer:
32
Result = 84
*/