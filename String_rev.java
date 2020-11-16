/*Q10. WAP to print a string in reverse order*/
import java.util.*;

class String_rev
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
		int index,i=len-1;
		for(index=0;index<len;index++)
		{
			arr2[i] = arr1[index];
			--i;
		}
		String str2 = new String(arr2);
		str1 = str2;
		System.out.println("Reversed string = "+str1);
	}
}
/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java String_rev
Enter a String :
ALLIGATOR
Original string value = ALLIGATOR
Reversed string = ROTAGILLA
*/