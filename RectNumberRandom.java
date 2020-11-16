/*Q8 Box of number in opposite direction in subsequent row*/

import java.util.*;

class RectNumberRandom
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
			if(i%2==1)
			{
				k=((i-1)*5)+1;
				for(j=1;j<=5;++j)
				{
					System.out.print(k+"\t");
					++k;
				}
			}
			else
			{
				k=i*5;
				for(j=1;j<=5;++j)
				{
					System.out.print(k+"\t");
					--k;
				}
			}
			System.out.print("\n");
		}
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java RectNumberRandom
Enter number of rows :
5

1       2       3       4       5
10      9       8       7       6
11      12      13      14      15
20      19      18      17      16
21      22      23      24      25
*/