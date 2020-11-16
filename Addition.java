/*Q1a Addition of two numbers*/

import java.util.*;

class Add
{
	int number;
	
	void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		number=sc.nextInt();
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

class Addition
{
	public static void main(String args[])
	{
		//Object creatation
		Add ob1 = new Add();
		Add ob2 = new Add();
		Add ob3 = new Add();
		
		//Object Input
		System.out.println("Enter 1st number :");
		ob1.get();
		System.out.println("Enter 2nd number :");
		ob2.get();
		
		//Addition
		ob3.addition(ob1,ob2);
		
		//Displaying result
		ob3.show();				
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java Addition
Enter 1st number :
Enter an integer:
15
Enter 2nd number :
Enter an integer:
30
Result = 45
*/