/*Q4. WAP to count number of words in a given string*/
import java.util.*;

class String_WordCount
{
	public static void main(String args[])
	{
		int i,count=1;
		char ch;
		String str = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		str = sc.nextLine();
		for(i=0;i<str.length();++i)
		{
			ch = str.charAt(i);
			if (Character.isWhitespace(ch))
			{
				count++;
			}
		}
		System.out.println("Number of Words : "+count);
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java String_WordCount
Enter a string :
ankit das navy
Number of Words : 3
*/