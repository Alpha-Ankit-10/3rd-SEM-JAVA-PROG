/*Q5 WAP to determine whether a given string is palindrome or not*/
import java.util.*;

class String_Palindrome
{
	public static void main(String args[])
	{
		String str1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		str1 = sc.nextLine();
		int len = str1.length(),i=0;
		char arr1[] = new char[len];
		char arr2[] = new char[len];
		str1.getChars(0,len,arr1,0);
		int index;
		boolean flag=true;
		for(index=len-1;index>=0;index--)
		{
			arr2[i] = arr1[index];
			++i;
		}
		for(i=0;i<len;++i)
		{
			if(arr1[i] != arr2[i])
				flag = false;
		}
		if(flag)
			System.out.println("String is a palindrome");
		else
			System.out.println("String is NOT a palindrome");
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java String_Palindrome
Enter a string :
javaj
String is a palindrome

E:\SEMESTER 3\Java\JAVA LAB PROG>java String_Palindrome
Enter a string :
java
String is NOT a palindrome
*/