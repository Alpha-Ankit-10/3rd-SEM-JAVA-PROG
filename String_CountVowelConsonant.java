/*Q2 WAP to count number of vowels and consonants in a string*/
import java.util.*;

class String_CountVowelConsonant
{
	public static void main(String args[])
	{
		int vow=0,con=0,i;
		char ch;
		String str = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a string : ");
		str = sc.nextLine();
		str=str.toUpperCase();
		for(i=0;i<str.length();++i)
		{
			ch = str.charAt(i);
			if (!Character.isAlphabetic(ch))
			{
				continue;
			}
			if(ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U')
			{
				vow++;
			}
			else
			{
				con++;
			}
		}
		System.out.println("Number of VOWELs : "+vow);
		System.out.println("Number of CONSONANTs : "+con);
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java String_CountVowelConsonant
ENter a string :
Ankit Das @ navy
Number of VOWELs : 4
Number of CONSONANTs : 8
*/