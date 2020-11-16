/*Q7 Lower left pyramid of sequencial numbers*/

import java.util.*;

class RandomSerialPyramid
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
			if(i%2==0)
			{
				for(j=1;j<=i;++j)
				{
					System.out.print(k+" ");
					++k;
				}
			}
			else
			{
				k+=(i-1);
				for(j=1;j<=i;++j)
				{
					System.out.print(k+" ");
					--k;					
				}
				k+=(i+1);
			}
			System.out.print("\n");
		}
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java RandomSerialPyramid
Enter number of rows :
5

1
2 3
6 5 4
7 8 9 10
15 14 13 12 11
*/