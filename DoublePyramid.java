/*Q9 pyramid double sided*/

import java.util.*;


class DoublePyramid
{
	public static void main(String args[])
	{
		int i,j,k,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows :");
		n=sc.nextInt();
		System.out.print("\n");
		k=n;
		for(i=1;i<=n;++i)
		{
			for(j=1;j<k;++j)
				System.out.print("  ");
			--k;	
			for(j=1;j<=i;++j)
			{
				System.out.print(j+" ");
			}
			for(j=i-1;j>=1;--j)
			{
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}
		for(i=n-1;i>=1;--i)
		{
			System.out.print("  ");
			for(k=1;k<n-i;++k)
			{
				System.out.print("  ");
			}
			for(j=1;j<=i;++j)
			{
				System.out.print(j+" ");
			}
			for(j=i-1;j>=1;--j)
			{
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}		
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java DoublePyramid
Enter number of rows :
5

        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
  1 2 3 4 3 2 1
    1 2 3 2 1
      1 2 1
        1
*/