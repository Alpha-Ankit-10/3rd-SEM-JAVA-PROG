/*Q1Lower left number triangle*/

import java.util.*;

class LowerPyramid
{
	public static void main(String args[])
	{
		int i,j,k,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows :");
		n=sc.nextInt();
		System.out.print("\n");
		for(i=1;i<=n;++i)
		{
			for(j=1;j<=i;++j)
			{
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java LowerTriangle
Enter number of rows :
5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/