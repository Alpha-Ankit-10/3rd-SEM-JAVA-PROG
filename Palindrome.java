/*Checking of palindrome number*/

import java.util.Scanner;

class Palindrome
{
	public static void main(String args[])
	{
		int arr[]= new int[15];
		int size,index,flag=1,i=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		size=sc.nextInt();
		
		System.out.println("Enter Value of array: ");
		for (index=0;index<size;++index)
		{
			arr[index]=sc.nextInt();
		}
		int rev[]= new int[15];
		for (index=size-1;index>=0;index--)
		{
			rev[i]=arr[index];
			++i;
		}
		for (index=0;index<size;++index)
		{
			if(arr[index]!=rev[index])
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not a Palindrome number");
		}
	}
}

/*
OUTPUT

E:\SEMESTER 3\Java\JAVA LAB PROG>java Palindrome
Enter size of array:
5
Enter Value of array:
1
2
3
2
1
Palindrome number
*/