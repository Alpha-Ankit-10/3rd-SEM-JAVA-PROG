/*Q1 WAP to find out the length of a given string */

import java.util.*;

class StringLength
{
	public static void main(String args[])
	{
		int length;
		String str = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a string : ");
		str = sc.nextLine();
		length = str.length();
		System.out.println("Length of string : "+length);
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java StringLength
ENter a string :
Ankit Das 3510
Length of string : 14
*/