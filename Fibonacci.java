/*Find the fibonacci series upto a number*/

import java.util.Scanner;

class Fibonacci
{
	public static void main(String args[])
	{
		int a,i,fib,x=0,y=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number terms to be displayed:");
		a=sc.nextInt();
		System.out.println("Fibonacci series :");
		if (a==0)
			System.out.println("0");
		else if (a==1)
			System.out.println("0 , 1");
		else
		{
			System.out.println("0\n1");
			for(i=1;i<=a;++i)
			{
				fib=x+y;
				x=y;
				y=fib;
				System.out.println(fib);
			}
		}
	}
}	

/*
OUTPUT

E:\SEMESTER 3\Java\JAVA LAB PROG>javac Fibonacci.java

E:\SEMESTER 3\Java\JAVA LAB PROG>java Fibonacci
Enter a number terms to be displayed:
5
Fibonacci series :
0
1
1
2
3
5
8
*/	