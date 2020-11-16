/*Q11 WAP to perform two matrix multiplication*/

import java.util.*;

class MatrixMultiplication
{
	public static void main(String args[])
	{
		int i,j,r,c,u,v,add,k;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Row & Coloumn resp for first matrix:");
		r=sc.nextInt();
		c=sc.nextInt();
		System.out.println("Enter the Row & Coloumn resp for Second matrix:");
		u=sc.nextInt();
		v=sc.nextInt();
		if(c!=u)
		{
			System.out.println("MatrixMultiplication is not possible!!");
			System.out.println("As the Number the Coloumn of first matrix is not equal to Number of row of second matrix");
			System.exit(0);
		}
		else
		{
			
			int a[][]=new int[r][c];
			int b[][]=new int[u][v];
			int product[][]=new int[r][v];
		
			System.out.println("Enter the First Matrix :");
			for(i=0;i<r;++i)
			{
				for(j=0;j<c;++j)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter the Second Matrix :");
			for(i=0;i<u;++i)
			{
				for(j=0;j<v;++j)
				{
					b[i][j]=sc.nextInt();
				}
			}
			//Multiplication of matrix
			for(i=0;i<r;++i)
			{
				for(j=0;j<v;++j)
				{
					add=0;
					for(k=0;k<u;++k)
					{
						add += a[i][k] * b[k][j];
					}
					product[i][j]=add;
				}
			}
		
			//Display
			System.out.println("Result matrix after Multiplication :");
			for(i=0;i<r;++i)
			{
				for(j=0;j<v;++j)
				{
					System.out.print(product[i][j]+"\t");
				}
				System.out.println();
			}
		}
		
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java MatrixMultiplication
Enter the Row & Coloumn resp for first matrix:
2
3
Enter the Row & Coloumn resp for Second matrix:
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
1
2
3
4
5
6
Result matrix after Multiplication :
22      28
49      64


E:\SEMESTER 3\Java\JAVA LAB PROG>java MatrixMultiplication
Enter the Row & Coloumn resp for first matrix:
2
3
Enter the Row & Coloumn resp for Second matrix:
2
3
MatrixMultiplication is not possible!!
As the Number the Coloumn of first matrix is not equal to Number of row of second matrix
*/