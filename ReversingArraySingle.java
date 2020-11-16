/*Q4 Reversing the array without using another array*/

import java.util.*;

class ReversingArraySingle
{
	public static void main(String args[])
	{
		int n,i,j,temp=0;  
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : "); //Size of array
		n= sc.nextInt();
		
		int x[] = new int[n];//Array initalization
		
		System.out.println("Enter the Elements of array : ");
		for(i=0;i<n;++i)
		{
			x[i]= sc.nextInt();		//input of element
		}
		
		//Reversing array
		for(i=0;i<n/2;++i)
		{
			temp=x[i];
			x[i]=x[n-i-1];
			x[n-i-1]=temp;
		}
		
		//Display array
		System.out.println("Reversed array : ");
		for(i=0;i<n;++i)
		{
			System.out.print(x[i]+"\t");
		}
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java ReversingArraySingle
Enter the size of array :
5
Enter the Elements of array :
1
2
3
4
5
Reversed array :
5       4       3       2       1
*/