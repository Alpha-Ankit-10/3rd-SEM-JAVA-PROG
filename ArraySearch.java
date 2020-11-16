/*Q1 Linear & binary Search using switch case*/

import java.util.*;

class ArraySearch
{
	public static void main(String args[])
	{
		int n,i,s,flag=0,first,last,mid;
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the size of array : ");//Size of array
		n= sc.nextInt();
		
		int x[] = new int[n];//Array initalization
		
		System.out.println("ENter the Elements of array(ascending order) : ");
		for(i=0;i<n;++i)
		{
			x[i]= sc.nextInt();		//input of element
		}
		//Element to be searched
		System.out.println("ENter the element to be searched : ");
		s=sc.nextInt();
		//Selection of search
		System.out.println("ENter L-Linear search or B-Binary Search : ");
		ch=sc.next().charAt(0);
		switch(ch)
		{
			case 'l':
			case 'L':
					for(i=0;i<n;++i)
					{
						if(s==x[i])
						{
							System.out.println("Element Found in linear search");
							flag=1;
							break;
						}
					}
					break;
			case 'b':		
			case 'B':
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
					break;
			default:
					System.out.println("Pls ENter correct option!!");
					break;
		}
		if(flag==0)
		{
			System.out.println("Element not found!!");
		}
	}	
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java ArraySearch
ENter the size of array :
5
ENter the Elements of array(ascending order) :
2
5
8
9
10
ENter the element to be searched :
5
ENter L-Linear search or B-Binary Search :
b
Element Found in binary search
*/