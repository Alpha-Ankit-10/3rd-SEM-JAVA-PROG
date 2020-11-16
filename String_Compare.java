/*Q11. WAP to compare two strings and find if they are equal*/
import java.util.*;

class String_Compare
{
	public static void main(String args[])
	{
		String str1, str2;
        Scanner sc = new Scanner(System.in);       
        System.out.println("Enter First String : ");
        str1 = sc.nextLine();
        System.out.println("Enter Second String : ");
        str2 = sc.nextLine();  
		if(str1.equals(str2))
		{
			System.out.println("Both string values are same");
		}
		else
		{
			System.out.println("Both string values are not same");
		}
	}
}
/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java String_Compare
Enter First String :
abcd
Enter Second String :
abcd
Both string values are same

E:\SEMESTER 3\Java\JAVA LAB PROG>java String_Compare
Enter First String :
abcd
Enter Second String :
ABCD
Both string values are not same
*/