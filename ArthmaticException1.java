/*Q1 Arithmetic exception handling*/

import java.util.*;

class ArthmaticException1
{
	public static void main(String args[])
	{
		System.out.println("Program Starts");
		try
		{
			int a,b,res;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first integer :");
			a = sc.nextInt();
			System.out.println("Enter the second integer :");
			b = sc.nextInt();
			if((a-b) == 0)
			{
				throw new ArithmeticException();
			}
			else
			{
				res=a/(a-b);
				System.out.println("Result = "+res);
			}
		}
		catch(ArithmeticException ob)	
		{
			System.out.println("Cannot divide by zero");
			System.out.println(ob);	
		}
		System.out.println("PRogram Over");
		System.out.println("Thank You");
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java ArthmaticException1
Program Starts
Enter the first integer :
2
Enter the second integer :
2
Cannot divide by zero
java.lang.ArithmeticException: / by zero
PRogram Over
Thank You
*/