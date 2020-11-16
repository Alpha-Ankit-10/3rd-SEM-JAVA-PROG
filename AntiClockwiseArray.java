/*Q5b Rotating the array Anticlockwise*/

import java.util.*;

class AntiClockwiseArray
{
	public static void main(String args[])
	{
		int n,i,j,temp,mid,r;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the size of array : ");//Size of array
		n= sc.nextInt();
		
		int x[] = new int[n];//Array initalization
		
		System.out.println("ENter the Elements of array : ");
		for(i=0;i<n;++i)
		{
			x[i]= sc.nextInt();		//input of element
		}
		
		//Rotating AntiClockwise of array
		System.out.println("ENter the number of ANTICLOCKWISE rotation : ");
		r=sc.nextInt();
		while(r!=0)
		{
			temp=x[0];
			for(i=0;i<n-1;++i)
			{
				x[i]=x[i+1];
			}
			x[n-1]=temp;
			--r;
		}
		System.out.println("AntiClockwise rotation Array :");
		for(i=0;i<n;++i)
		{
			System.out.print(x[i]+"\t");
		}
	}
}
/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java AntiClockwiseArray
ENter the size of array :
5
ENter the Elements of array :
1
2
3
4
5
ENter the number of ANTICLOCKWISE rotation :
2
AntiClockwise rotation Array :
3       4       5       1       2
*/