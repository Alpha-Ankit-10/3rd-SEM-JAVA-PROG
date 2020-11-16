/*Q13. WAP to sort a string’s character in alphabetic order*/
import java.util.*;

class String_Alphabetic_Order
{
	public static void main(String args[])
	{
		String str1;
		Scanner sc = new Scanner(System.in);       
        System.out.println("Enter a String : ");
        str1 = sc.nextLine();
		int len = str1.length();
		char arr1[] = new char[len],temp;
		str1.getChars(0,len,arr1,0);
		System.out.println("Original string value = "+str1);
		int i , j;
		for(i= 1;i<len;i++)
		{
			temp=arr1[i];
			j = i - 1;
			while (j>=0&&arr1[j]>temp)
			{
				arr1[j+1]=arr1[j];
				j=j-1;
			}
			arr1[j+1]=temp;
		}
		String str2 = new String(arr1);
		System.out.println("Alphabetically Sorted string = "+str2);
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java String_Alphabetic_Order
Enter a String :
SILICON
Original string value = SILICON
Alphabetically Sorted string = CIILNOS
*/