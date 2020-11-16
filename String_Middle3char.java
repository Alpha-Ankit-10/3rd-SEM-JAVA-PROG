/*Q3 WAP to print the middle 3 characters of a string in uppercase*/
import java.util.*;

class String_Middle3char
{
	public static void main(String args[])
	{
		int len,i,mid;
		char ch;
		String str = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a string : ");
		str = sc.nextLine();
		len = str.length();
		if(len<3)
		{
			System.out.println("Number of string is less than 3!!");
			System.exit(0);
		}
		mid = len/2;
		String str1=str.substring(mid-1,mid+2);
		str1 = str1.toUpperCase();
		System.out.println("Middle 3 char of string : "+str1);
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java String_Middle3char
ENter a string :
ankit
Middle 3 char of string : NKI

E:\SEMESTER 3\Java\JAVA LAB PROG>java String_Middle3char
ENter a string :
java
Middle 3 char of string : AVA

E:\SEMESTER 3\Java\JAVA LAB PROG>javac String_Middle3char.java

E:\SEMESTER 3\Java\JAVA LAB PROG>java String_Middle3char
ENter a string :
as
Number of string is less than 3!!
*/