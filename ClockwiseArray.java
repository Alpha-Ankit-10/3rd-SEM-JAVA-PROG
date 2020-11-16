/*Q5a Rotating the array clockwise*/

import java.util.*;

class ClockwiseArray
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
		
		//Rotating Clockwise of array
		System.out.println("ENter the number of rotation : ");
		r=sc.nextInt();
		while(r!=0)
		{
			temp=x[n-1];
			for(i=n-1;i>0;--i)
			{
				x[i]=x[i-1];
			}
			x[0]=temp;
			--r;
		}
		System.out.println("Clockwise rotation Array :");
		for(i=0;i<n;++i)
		{
			System.out.print(x[i]+"\t");
		}
	}
}
/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java ClockwiseArray
ENter the size of array :
5
ENter the Elements of array :
1
2
3
4
5
ENter the number of rotation :

3
Clockwise rotation Array :
3       4       5       1       2
*/