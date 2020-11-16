/*Q5 Rotating the array Clockwise & Anticlockwise*/

import java.util.*;

class RotationArray
{
	public static void main(String args[])
	{
		int n,i,j,temp,mid,r,ctr;
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the size of array : ");//Size of array
		n= sc.nextInt();
		
		int x[] = new int[n];//Array initalization
		
		System.out.println("ENter the Elements of array : ");
		for(i=0;i<n;++i)
		{
			x[i]= sc.nextInt();		//input of element
		}
		
		System.out.println("Enter \n1-CLockwise rotation\n2-Anti-Clockwise rotation");
		ctr=sc.nextInt();
		switch(ctr)
		{
		case 1:
			//Rotating Clockwise of array
			System.out.println("ENter the number of rotation : ");
			r=sc.nextInt();
			while(r!=0)
			{
				temp=x[n-1];
				for(i=n-1;i>0;--i)
				{
					x[i]=x[i-1];
				}
				x[0]=temp;
				--r;
			}
			System.out.println("Clockwise rotation Array :");
			for(i=0;i<n;++i)
			{
				System.out.print(x[i]+"\t");
			}
			break;
		case 2:
					System.out.println("ENter the Elements of array : ");
			//Rotating AntiClockwise of array
			System.out.println("ENter the number of ANTICLOCKWISE rotation : ");
			r=sc.nextInt();
			while(r!=0)
			{
				temp=x[0];
				for(i=0;i<n-1;++i)
				{
					x[i]=x[i+1];
				}
				x[n-1]=temp;
				--r;
			}
			System.out.println("AntiClockwise rotation Array :");
			for(i=0;i<n;++i)
			{
				System.out.print(x[i]+"\t");
			}
			break;	
		default:
			System.out.println("Please Enter correct option!!");
		}
	}
}
/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java RotationArray
ENter the size of array :
5
ENter the Elements of array :
1
2
3
4
5
Enter
1-CLockwise rotation
2-Anti-Clockwise rotation
1
ENter the number of rotation :
3
Clockwise rotation Array :
3       4       5       1       2

E:\SEMESTER 3\Java\JAVA LAB PROG>java RotationArray
ENter the size of array :
5
ENter the Elements of array :
1
2
3
4
5
Enter
1-CLockwise rotation
2-Anti-Clockwise rotation
2
ENter the Elements of array :
ENter the number of ANTICLOCKWISE rotation :
3
AntiClockwise rotation Array :
4       5       1       2       3
*/