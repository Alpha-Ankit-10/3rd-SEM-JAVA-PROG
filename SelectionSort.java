/*Selection sort*/

import java.util.*;

class SelectionSort
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
		//Selection sort
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
	}
}