/*Find the GCD & LCM of two numbers*/

import java.util.Scanner;

class GcdLcm
{
	public static void main(String args[])
	{
		int a,b,gcd,lcm,max,ctr;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		a=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		b=sc.nextInt();
		
		if(a>b)
			max=ctr=a;
		else
			max=ctr=b;
		
		while(a!=0&&b!=0)
		{
			if(max%a==0 && max%b==0)
				break;
			max+=ctr;
		}
		lcm=max;
		System.out.println("LCM of "+a+" & "+b+" is "+lcm);
		gcd=(a*b)/lcm;
		System.out.println("GCD of "+a+" & "+b+" is "+gcd);
	}
}

/*
OUTPUT

E:\SEMESTER 3\Java\JAVA LAB PROG>java GcdLcm
Enter 1st number:
15
Enter 2nd number:
10
LCM of 15 & 10 is 30
GCD of 15 & 10 is 5
*/