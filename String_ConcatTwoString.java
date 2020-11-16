/*WAP to concatenate two string and store in a third string*/
import java.util.*;

class String_ConcatTwoString
{
	public static void main(String args[])
	{
		String str1, str2;
        Scanner sc = new Scanner(System.in);       
        System.out.println("Enter First String : ");
        str1 = sc.nextLine();
        System.out.println("Enter Second String : ");
        str2 = sc.nextLine();       
		String str3 = new String(str1.concat(str2));
		
		System.out.println("Conctenated String : "+str3);
	}
}
/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java String_ConcatTwoString
Enter First String :
Java
Enter Second String :
Programming
Conctenated String : JavaProgramming
*/