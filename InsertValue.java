/*Q8 Insert an element after given Value*/

import java.util.*;

class InsertValue
{
	public static void main(String args[])
	{
		int n,i,j,ind=0,ele,temp,flag=0,val;  //ind expects an initialization
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : ");//Size of array
		n= sc.nextInt();
		
		int x[] = new int[n+5];//Array initalization
		
		System.out.println("Enter the Elements of array : ");
		for(i=0;i<n;++i)
		{
			x[i]= sc.nextInt();		//input of element
		}
		
		System.out.println("Enter the Value after which element will be inserted: ");
		val=sc.nextInt();
		System.out.println("Enter the Elements to insert: ");
		ele=sc.nextInt();
		
		for(i=0;i<n;++i)//checking the value
		{
			if(x[i]==val)
			{
				ind=i+1;//acts local to this block
				flag=1;
				break;
			}
		}
		
		if(flag==1)
		{
			for(i=n;i>=ind;--i)
			{
				x[i]=x[i-1];
			}
			x[ind]=ele;
			System.out.println("Array after insertion after given value:");
			for(i=0;i<n+1;++i)
			{
				System.out.print(x[i]+"\t");
			}
		}
		else
		{
			System.out.println("Element of entered Value was not found!!");
		}
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java InsertValue
Enter the size of array :
5
Enter the Elements of array :
1
2
3
4
5
Enter the Value after which element will be inserted:
3
Enter the Elements to insert:
10
Array after insertion after given value:
1       2       3       10      4       5
*/