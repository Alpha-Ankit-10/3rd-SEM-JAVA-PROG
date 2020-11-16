/*Q2a Printing complex number addition*/

import java.util.*;

class Complex1
{
	int real,img;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Real value :");
		real=sc.nextInt();
		System.out.println("Enter Imaginary value :");
		img=sc.nextInt();
	}
	void addition(Complex1 obj1,Complex1 obj2)
	{
		real=obj1.real + obj2.real;
		img=obj1.img + obj2.img;
	}
	void display()
	{
		System.out.println("Result = "+real+" + "+img+"i");
	}
}
class ComplexAddition
{
	public static void main(String args[])
	{
		//Object creatation
		Complex1 ob1 = new Complex1();
		Complex1 ob2 = new Complex1();
		Complex1 ob3 = new Complex1();
		
		//Object Input
		System.out.println("Enter 1st Complex number :");
		ob1.input();
		System.out.println("Enter 2nd Complex number :");
		ob2.input();
		
		//Addition
		ob3.addition(ob1,ob2);
		
		//Displaying result
		ob3.display();
						
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java ComplexAddition
Enter 1st Complex number :
Enter Real value :
5
Enter Imaginary value :
10
Enter 2nd Complex number :
Enter Real value :
12
Enter Imaginary value :
35
Result = 17 + 45i
*/