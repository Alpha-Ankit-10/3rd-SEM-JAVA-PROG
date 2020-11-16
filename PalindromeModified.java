/*Checking of palindrome number*/

import java.util.Scanner;

class PalindromeModified
{
	public static void main(String args[])
	{
		int n,rev=0,i,ld;
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		i=n;
		while(i!=0) //to get number of digits
		{
			ld=i%10;
			rev=(rev*10)+ld;
			i/=10;
		}
		if(n==rev)
		{
			System.out.println("Palindrome number");
		}			
		else
			System.out.println("Not a Palindrome number");
		sc.close();
	}
}

/*
OUTPUT

E:\SEMESTER 3\Java\JAVA LAB PROG>java PalindromeModified
12321
Palindrome number

E:\SEMESTER 3\Java\JAVA LAB PROG>java PalindromeModified
12345
Not a Palindrome number
*/