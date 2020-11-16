/*Q7 Delete an element at given index*/

import java.util.*;

class DeleteIndex
{
	public static void main(String args[])
	{
		int n,i,j,ind,ele,temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : ");//Size of array
		n= sc.nextInt();
		
		int x[] = new int[n];//Array initalization
		
		System.out.println("Enter the Elements of array : ");
		for(i=0;i<n;++i)
		{
			x[i]= sc.nextInt();		//input of element
		}
		
		System.out.println("Enter the Index to Delete element: ");
		ind=sc.nextInt();
		ele=x[ind];
		
		for(i=ind;i<n-1;++i)
		{
			x[i]=x[i+1];
		}
		System.out.println("Deleted element is "+ele);
		
		System.out.println("Array after Deleting at given index:");
		for(i=0;i<n-1;++i)
		{
			System.out.print(x[i]+"\t");
		}
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java DeleteIndex
Enter the size of array :
5
Enter the Elements of array :
1
2
3
4
5
Enter the Index to Delete element:
2
Deleted element is 3
Array after Deleting at given index:
1       2       4       5
*/