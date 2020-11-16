/*Q11 star rhombus*/

import java.util.*;

class StarRhombus
{
	public static void main(String args[])
	{
		int i,j,n,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows :");
		n=sc.nextInt();
		System.out.print("\n");	
		k=1;
		for(i=1;i<=n;++i)
		{
			for(j=n-i;j>0;--j)
				System.out.print("  ");
			System.out.print("* ");
			for(j=0;j<(i*2)-3;++j)
			{
				System.out.print("  ");
			}
			if(i!=1)
				System.out.print("* ");
			System.out.print("\n");
		}	
		for(i=n-1;i>=1;--i)
		{
			for(j=n-i;j>0;--j)
				System.out.print("  ");
			System.out.print("* ");
			for(j=0;j<(i*2)-3;++j)
			{
				System.out.print("  ");
			}
			if(i!=1)
				System.out.print("* ");
			System.out.print("\n");
		}			
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java StarRhombus
Enter number of rows :
5

        *
      *   *
    *       *
  *           *
*               *
  *           *
    *       *
      *   *
        *
*/