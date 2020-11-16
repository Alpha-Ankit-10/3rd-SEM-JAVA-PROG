/*Find the factorial numbers*/

import java.util.Scanner;

class Factorial
{
	public static void main(String args[])
	{
		int a,i,fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		a=sc.nextInt();
		if(a<0)
			fact=0;
		else if(a==0)
			fact=1;
		else
		{
			for(i=1;i<=a;++i)
			{
				fact*=i;
			}
		}
		if(fact==0)
			System.out.println("Pls ENter Positive number !!");
		else
			System.out.println("Factorial of "+a+" is "+fact);
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>javac Factorial.java

E:\SEMESTER 3\Java\JAVA LAB PROG>java Factorial
Enter a number:
5
Factorial of 5 is 120
*/		