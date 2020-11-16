/*Q12. WAP to copy one string to another string*/
import java.util.*;

class String_Copy
{
	public static void main(String args[])
	{
		String str1;
		Scanner sc = new Scanner(System.in);       
        System.out.println("Enter a String : ");
        str1 = sc.nextLine();
		int len = str1.length();
		char arr1[] = new char[len];
		char arr2[] = new char[len];
		str1.getChars(0,len,arr1,0);
		System.out.println("Original string value = "+str1);
		int index;
		for(index=0;index<len;index++)
		{
			arr2[index] = arr1[index];
		}
		String str2 = new String(arr2);
		System.out.println("Copied string value = "+str2);
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java String_Copy
Enter a String :
I AM A PROGRAMMER
Original string value = I AM A PROGRAMMER
Copied string value = I AM A PROGRAMMER
*/