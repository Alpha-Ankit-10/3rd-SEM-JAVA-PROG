/*Q2 Bubble,selection & insertion sort using switch case*/

import java.util.*;

class ArraySort
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
		//Selection of sorting
		System.out.println("ENter 1-Bubble sort 2-Selection sort 3-Insertion sort : ");
		ctr=sc.nextInt();
		
		switch(ctr)
		{
			case 1:						//Bubble sort
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
				break;
				
			case 2:						//Selection sort
				for(i=0;i<n;++i)
				{
					min=x[i];
					loc=i;
					for(j=i;j<n;++j)
					{
						if(min>x[j])
						{
							min=x[j];
							loc=j;
						}
					}
					x[loc]=x[i];
					x[i]=min;
				}
				System.out.println("Array after Selection Sort :");
				for(i=0;i<n;++i)
				{
					System.out.print(x[i]+"\t");
				}
				break;
				
			case 3:						//Insertion sort
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
				break;
			default:
				System.out.println("Pls Enter the correct option !!");
		}
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java ArraySort
ENter the size of array :
5
ENter the Elements of array :
26
3
51
8
99
ENter 1-Bubble sort 2-Selection sort 3-Insertion sort :
1
Array after Bubble Sort :
3       8       26      51      99

E:\SEMESTER 3\Java\JAVA LAB PROG>java ArraySort
ENter the size of array :
5
ENter the Elements of array :
69
56
22
44
82
ENter 1-Bubble sort 2-Selection sort 3-Insertion sort :
3
Array after Insertion Sort :
22      44      56      69      82
*/