/*Display the value in its corresponding word format using switch case*/

import java.util.Scanner;

class NumberWordModified
{
	public static void main(String args[])
	{
		int a,ld=0,rev=0,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		a=sc.nextInt();
		for(i=a;i!=0;i/=10) //reversing number
		{
			ld++;
		}
		int d,j=ld-1,arr[]=new int[ld];
		for(i=a;i!=0&&j>=0;i/=10)
		{
			d=i%10;
			arr[j]=d;
			--j;
		}
		System.out.println("Number in words :");
		j=0;
		while(j<ld)
		{
			d=arr[j];
			switch(d)
			{
				case 0:                  
						System.out.print("ZERO ");  
						break;
				case 1:
						System.out.print("ONE ");
						break;
				case 2:
						System.out.print("TWO ");
						break;
				case 3:
						System.out.print("THREE ");
						break;
				case 4:
						System.out.print("FOUR ");
						break;
				case 5:
						System.out.print("FIVE ");
						break;
				case 6:
						System.out.print("SIX ");
						break;
				case 7:
						System.out.print("SEVEN ");
						break;
				case 8:
						System.out.print("EIGHT ");
						break;
				case 9:
						System.out.print("NINE ");
						break;
				default:
						break;
			}
			++j;
		}
	}
}

/*
OUTPUT

E:\SEMESTER 3\Java\JAVA LAB PROG>java NumberWordModified
Enter a number:
100
Number in words :
ONE ZERO ZERO
E:\SEMESTER 3\Java\JAVA LAB PROG>java NumberWordModified
Enter a number:
0120
Number in words :
ONE TWO ZERO
*/