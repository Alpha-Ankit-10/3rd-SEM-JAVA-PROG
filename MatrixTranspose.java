/*Q12 Find transpose of a matrix*/

import java.util.*;

class MatrixTranspose
{
	public static void main(String args[])
	{
		int i,j,r,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Row & Coloumn resp :");
		r=sc.nextInt();
		c=sc.nextInt();
		
		int a[][]=new int[r][c];
		int t[][]=new int[c][r];
		
		System.out.println("Enter the Matrix :");
		for(i=0;i<r;++i)
		{
			for(j=0;j<c;++j)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<c;++i)
		{
			for(j=0;j<r;++j)
			{
				t[i][j] = a[j][i];
			}
		}
		//Display
		System.out.println("Transpose Matrix :");
		for(i=0;i<c;++i)
		{
			for(j=0;j<r;++j)
			{
				System.out.print(t[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java MatrixTranspose
Enter the Row & Coloumn resp :
2
3
Enter the Matrix :
1
2
3
4
5
6
Transpose Matrix :
1       4
2       5
3       6
*/