/*Q6 Insert an element at given index*/

import java.util.*;

class InsertIndex
{
	public static void main(String args[])
	{
		int n,i,j,ind,ele,temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : ");//Size of array
		n= sc.nextInt();
		
		int x[] = new int[n+5];//Array initalization
		
		System.out.println("Enter the Elements of array : ");
		for(i=0;i<n;++i)
		{
			x[i]= sc.nextInt();		//input of element
		}
		
		System.out.println("Enter the Index to insert element: ");
		ind=sc.nextInt();
		System.out.println("Enter the Elements to insert: ");
		ele=sc.nextInt();
		
		for(i=n;i>=ind;--i)
		{
			x[i]=x[i-1];
		}
		x[ind]=ele;
		
		System.out.println("Array after insertion at given index:");
		for(i=0;i<n+1;++i)
		{
			System.out.print(x[i]+"\t");
		}
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java InsertIndex
Enter the size of array :
5
Enter the Elements of array :
1
2
3
4
5
Enter the Index to insert element:
3
Enter the Elements to insert:
10
Array after insertion at given index:
1       2       3       10      4       5
*/