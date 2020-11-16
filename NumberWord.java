/*Display the value in its corresponding word format using switch case*/

import java.util.Scanner;

class NumberWord
{
	public static void main(String args[])
	{
		int a,ld,rev=0,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		a=sc.nextInt();
		for(i=a;i!=0;i/=10) //reversing number
		{
			ld=i%10;
			rev=(rev*10)+ld;
		}
		System.out.println("Number in words :");
		while(rev!=0)
		{
			ld=rev%10;
			switch(ld)
			{
				case 0:                  
						System.out.print("ZERO ");  //Zero will not be printed if its the last digit
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
			rev/=10;
		}
		if(a%10==0)	
			System.out.print("ZERO ");  //To print Zero if the last digit is zero
		
	}
}

/*
OUTPUT

E:\SEMESTER 3\Java\JAVA LAB PROG>java NumberWord
Enter a number:
120
Number in words :
ONE TWO ZERO
*/