/*Bubble sort */

import java.util.*;

class BubbleSort
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
		//Bubble sort
		for(i=0;i<n-1;++i)
		{
			for(j=0;j<n-1-i;++j)
			{
				if(x[j]>x[j+1])
				{
					temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		System.out.println("Array after Bubble Sort :");
		for(i=0;i<n;++i)
		{
			System.out.print(x[i]+"\t");
		}
	}
}