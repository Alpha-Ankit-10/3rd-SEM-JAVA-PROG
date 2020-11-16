/*Q4 Reversing an array without using a Another array*/

import java.util.*;

class ReverseArrayWithoutNewArray
{
	public static void main(String args[])
	{
		int n,i,j,temp,mid;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the size of array : ");//Size of array
		n= sc.nextInt();
		
		int x[] = new int[n];//Array initalization
		
		System.out.println("ENter the Elements of array : ");
		for(i=0;i<n;++i)
		{
			x[i]= sc.nextInt();		//input of element
		}
		
		//Revering array
		j=n-1;
		if(n%2==0)
			mid=(n/2)-1;
		else
			mid=(n-1)/2;
		for(i=0;i<mid;++i)
		{
			temp=x[i];
			x[i]=x[j];
			x[j]=temp;
			--j;
		}
		System.out.println("Reversed Array :");
		for(i=0;i<n;++i)
		{
			System.out.print(x[i]+"\t");
		}
	}
}
/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java ReverseArrayWithoutNewArray
ENter the size of array :
5
ENter the Elements of array :
11
22
33
44
55
Reversed Array :
55      44      33      22      11

E:\SEMESTER 3\Java\JAVA LAB PROG>java ReverseArrayWithoutNewArray
ENter the size of array :
6
ENter the Elements of array :
11
22
33
44
55
66
Reversed Array :
66      55      33      44      22      11
*/