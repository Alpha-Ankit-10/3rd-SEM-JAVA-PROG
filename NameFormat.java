/*Q3 NAme Format Exception application*/

import java.util.Scanner;

class NameFormatException extends Exception
{
	String str;
	NameFormatException(String msg)
	{
		str=msg;
	}
	public String toString()
	{
		return("Name Format : "+str);		
	}
}

class NameFormat
{
	static void check_Validity(String name) throws NameFormatException
	{
		boolean flag=true;
		for (int i = 0; i < name.length(); i++) 
		{
			char ch = name.charAt(i);
			if (!Character.isAlphabetic(ch))
			{
				if (Character.isWhitespace(ch))
					continue;
				flag=false;
			}
		}		
		if(flag==false)
		{
			throw new NameFormatException("INVALID");
		}
		else
		{
			System.out.println("CORRECT FORMAT OF NAME!!");
		}
	}
	
	public static void main(String[] args) 
	{
		try
		{
			String name;
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter your name - ");
			name =  sc.nextLine();
			check_Validity(name);
		}
		catch (NameFormatException ob) 
		{
			System.out.println("Exception occured "+ob);
		}
		finally
		{
			System.out.println("Thank you");
		}
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java NameFormat
Please enter your name -
Ankit das
CORRECT FORMAT OF NAME!!
Thank you

E:\SEMESTER 3\Java\JAVA LAB PROG>java NameFormat
Please enter your name -
Ankit@das
Exception occured Name Format : INVALID
Thank you
*/