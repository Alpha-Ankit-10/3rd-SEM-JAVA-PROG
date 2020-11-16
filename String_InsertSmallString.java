/*WAP to insert a small string into a given main string at a particular position*/
import java.util.*;

class String_InsertSmallString
{
	public static void main(String args[])
	{
		String str1,str2;
        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter First String : ");
        str1 = sc.nextLine();
		
		int len1 = str1.length(),n,ind,i,j=0;
		char arr1[] = new char[len1];
		str1.getChars(0,len1,arr1,0);
		
		System.out.print("Enter Second String : ");
        str2 = sc.nextLine();   
		int len2 = str2.length();
		char arr2[] = new char[len2];
		str2.getChars(0,len2,arr2,0);
		
		System.out.print("Enter Index value to insert string : ");
		ind = sc.nextInt();
		char arr3[] = new char[len1 + len2+1];
		
		for(i=0;i<ind;++i)
		{
			arr3[j]=arr1[i];
			++j;
		}
		for(i=0;i<len2;++i)
		{
			arr3[j] = arr2[i];
			++j;
		}
		for(i=ind;i<len1;++i)
		{
			arr3[j] = arr1[i];
			++j;
		}
		String str3 = new String(arr3);
		System.out.println("\nStrings before Inserting are :");
        System.out.println("String 1 = " +str1);
        System.out.println("String 2 = " +str2);
		System.out.println("\nStrings after Inserting are :");
        System.out.println("Resultant string = " +str3);
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java String_InsertSmallString
Enter First String : ALPtor
Enter Second String : HA ga
Enter Index value to insert string :3

Strings before Inserting are :
String 1 = ALPtor
String 2 = HA ga

Strings after Inserting are :
Resultant string = ALPHA gator
*/