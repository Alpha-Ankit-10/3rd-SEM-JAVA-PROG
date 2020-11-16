/*Q2 Lower left Alphabet triangle*/

import java.util.*;

class AlphaLowerPyramid
{
	public static void main(String args[])
	{
		int i,j,n;
		char k='A';
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows :");
		n=sc.nextInt();
		System.out.print("\n");
		for(i=1;i<=n;++i)
		{
			for(j=1;j<=i;++j)
			{
				System.out.print(k+" ");
				
			}
			System.out.print("\n");
			if(i==26)
				k='A';
			else
				++k;
		}
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java AlphaLowerPyramid
Enter number of rows :
5

A
B B
C C C
D D D D
E E E E E
*/