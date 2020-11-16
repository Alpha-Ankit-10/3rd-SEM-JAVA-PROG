/*Q1b Binary Search*/

import java.util.*;

class BinarySearch
{
	public static void main(String args[])
	{
		int n,i,s,flag=0,first,last,mid;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the size of array : ");//Size of array
		n= sc.nextInt();
		
		int x[] = new int[n];//Array initalization
		
		System.out.println("ENter the Elements of array(Ascending order) : ");
		for(i=0;i<n;++i)
		{
			x[i]= sc.nextInt();		//input of element
		}
		//Element to be searched
		System.out.println("ENter the element to be searched : ");
		s=sc.nextInt();
		
		//Binary search
		first=0;
		last=n-1;
		while(first<=last)
		{
			mid=(first+last)/2;
			if(s==x[mid])
			{
				System.out.println("Element Found in binary search");
				flag=1;
				break;
			}
			if(s<x[mid])
			{
				last=mid-1;
			}
			else 
			{
				first=mid+1;
			}
		}
		if(flag==0)
		{
			System.out.println("Element not found!!");
		}
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java BinarySearch
ENter the size of array :
5
ENter the Elements of array(Ascending order) :
3
7
9
11
15
ENter the element to be searched :
15
Element Found in binary search
*/