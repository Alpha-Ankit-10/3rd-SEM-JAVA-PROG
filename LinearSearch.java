/*Q1a Linear Search*/

import java.util.*;

class LinearSearch
{
	public static void main(String args[])
	{
		int n,i,s,flag=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the size of array : ");//Size of array
		n= sc.nextInt();
		
		int x[] = new int[n];//Array initalization
		
		System.out.println("ENter the Elements of array : ");
		for(i=0;i<n;++i)
		{
			x[i]= sc.nextInt();		//input of element
		}
		//Element to be searched
		System.out.println("ENter the element to be searched : ");
		s=sc.nextInt();
		
		//Linear search
		for(i=0;i<n;++i)
		{
			if(s==x[i])
			{
				System.out.println("Element Found in linear search");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Element not found!!");
		}
	}
}
/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java LinearSearch
ENter the size of array :
5
ENter the Elements of array :
9
6
1
5
77
ENter the element to be searched :
1
Element Found in linear search
*/