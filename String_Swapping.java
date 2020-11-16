/*Q6 WAP to swap two strings*/
import java.util.*;

class String_Swapping
{
	public static void main(String args[])
	{
		String str1, str2, strtemp;
        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter First String : ");
        str1 = sc.nextLine();
        System.out.print("Enter Second String : ");
        str2 = sc.nextLine();       
        System.out.println("\nStrings before Swapping are :");
        System.out.println("String 1 = " +str1);
        System.out.println("String 2 = " +str2);       
        strtemp = str1;
        str1 = str2;
        str2 = strtemp;      
        System.out.println("\nStrings after Swapping are :");
        System.out.println("String 1 = " +str1);
        System.out.println("String 2 = " +str2);
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java String_Swapping
Enter First String : java
Enter Second String : programming

Strings before Swapping are :
String 1 = java
String 2 = programming

Strings after Swapping are :
String 1 = programming
String 2 = java
*/