/*Q3 Copying one array to another in reverse manner*/

import java.util.*;

class ArrayReverse
{
	public static void main(String args[])
	{
		int n,i,j;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the size of array : ");//Size of array
		n= sc.nextInt();
		
		int x[] = new int[n];//Array initalization
		int arr[] = new int[n];
		
		System.out.println("ENter the Elements of array : ");
		for(i=0;i<n;++i)
		{
			x[i]= sc.nextInt();		//input of element
		}
		
		//Reversing and copy of array to new array
		j=n-1;
		for(i=0;i<n;++i,--j)
		{
			arr[j]=x[i];
		}
		
		System.out.println("Array :");
		for(i=0;i<n;++i)
		{
			System.out.print(x[i]+"\t");
		}
		System.out.println("\nReversed copy of Array :");
		for(i=0;i<n;++i)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}
/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java ArrayReverse
ENter the size of array :
5
ENter the Elements of array :
11
22
33
44
55
Array :
11      22      33      44      55
Reversed copy of Array :
55      44      33      22      11
*/