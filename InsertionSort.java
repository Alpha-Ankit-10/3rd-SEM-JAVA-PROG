/*Insertion Sort*/

import java.util.*;

class InsertionSort
{
	public static void main(String args[])
	{
		int n,i,j,s,temp,loc,min,ctr;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the size of array : ");//Size of array
		n= sc.nextInt();
		
		int x[] = new int[n];//Array initalization
		
		System.out.println("ENter the Elements of array : ");
		for(i=0;i<n;++i)
		{
			x[i]= sc.nextInt();		//input of element
		}
		//Insertion sort
		for(i= 1;i<n;i++)
		{
			temp=x[i];
			j = i - 1;
			while (j>=0&&x[j]>temp)
			{
				x[j+1]=x[j];
				j=j-1;
			}
			x[j+1]=temp;
		}
		System.out.println("Array after Insertion Sort :");
		for(i=0;i<n;++i)
		{
			System.out.print(x[i]+"\t");
		}
	}
}