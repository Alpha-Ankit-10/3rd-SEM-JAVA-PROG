/*Q3 Lower left Continious number triangle*/

import java.util.*;

class NumberLowerPyramid
{
	public static void main(String args[])
	{
		int i,j,k=1,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows :");
		n=sc.nextInt();
		System.out.print("\n");
		for(i=1;i<=n;++i)
		{
			for(j=1;j<=i;++j)
			{
				System.out.print(k+" ");
				++k;
			}
			System.out.print("\n");
		}
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java NumberLowerPyramid
Enter number of rows :
5

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/