/*Q9 Addition of two matrix*/

import java.util.*;

class MatrixAddition
{
	public static void main(String args[])
	{
		int i,j,r,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Row & Coloumn resp :");
		r=sc.nextInt();
		c=sc.nextInt();
		
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int sum[][]=new int[r][c];
		
		System.out.println("Enter the First Matrix :");
		for(i=0;i<r;++i)
		{
			for(j=0;j<c;++j)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the Second Matrix :");
		for(i=0;i<r;++i)
		{
			for(j=0;j<c;++j)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		//Matrix Addition
		for(i=0;i<r;++i)
		{
			for(j=0;j<c;++j)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		
		//Display Added matrix
		System.out.println("Result matrix after addition :");
		for(i=0;i<r;++i)
		{
			for(j=0;j<c;++j)
			{
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java MatrixAddition
Enter the Row & Coloumn resp :
3
2
Enter the First Matrix :
1
2
3
4
5
6
Enter the Second Matrix :
10
10
10
10
10
10
Result matrix after addition :
11      12
13      14
15      16
*/