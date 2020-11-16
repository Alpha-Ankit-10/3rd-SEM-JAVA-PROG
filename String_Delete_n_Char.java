/*Q7 WAP to delete n characters from a given position in a given string*/
import java.util.*;

class String_Delete_n_Char
{
	public static void main(String args[])
	{
		String str1;
        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter First String : ");
        str1 = sc.nextLine();
		int len = str1.length(),n,ind,i,j=0;
		char arr1[] = new char[len];
		str1.getChars(0,len,arr1,0);
		System.out.print("Enter Index value to delete char : ");
		ind = sc.nextInt();
		System.out.print("Enter number of char to be deleted : ");
		n = sc.nextInt();
		char arr2[] = new char[len - n];
		for(i=0;i<len;++i)
		{
			if(i>=ind && i<ind+n)
			{
				continue;
			}
			else
			{
				arr2[j] = arr1[i];
				++j;
			}
		}
		String str2= new String(arr2);
		System.out.print("Resultant string : "+str2);
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java String_Delete_n_Char
Enter First String : java
Enter Index value to delete char : 2
Enter number of char to be deleted : 1
Resultant string : jaa
*/