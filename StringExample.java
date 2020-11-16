/*String demo*/

import java.util.Scanner;

class StringExample
{
    public static void main(String[] args)
	{
		//Creating 03 strings in different way
		String str1="silicon institute of technology";
		String str2=new String("I love my country");
		char arr[]={'E','E','E','S','e','c','A'};
		String str3=new String(arr);//Converted char to array
		//display all strings
		System.out.println("String1 ="+str1);
		System.out.println("String2 ="+str2);		
		System.out.println("String3 ="+str3);
		
		//find the length
		System.out.println("length of String1 ="+str1.length());
		//concatenating two strings
		System.out.println("String1 & String2 are concatenated ="+str1.concat(str2));
		//concatenating result strings
		System.out.println("Concatenated result= "+str1+" from "+str3);
		
		//Starting from particular value
		boolean value= str1.startsWith("s");  //""  is required & case sentitive
		if (value)
			System.out.println("String1 starts with s");
		else
			System.out.println("String1 doesnt starts with s");
		
		//Extracting substring from strings
		String str4=str2.substring(0,6);//starting to end-1
		System.out.println("String4 ="+str4);
		
		//convrting to lower case
		String str5=str3.toLowerCase();
		System.out.println("String5 ="+str5);
		
		//convrting to upper case
		String str6=str3.toUpperCase();
		System.out.println("String6 ="+str6);
		
		//Split the string with word
		String str7[]; //Array of strings
		str7=str1.split(" ");
		for(int index=0;index<str7.length;++index)
			System.out.println(str7[index]+" ");
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java StringExample
String1 =silicon institute of technology
String2 =I love my country
String3 =EEESecA
length of String1 =31
String1 & String2 are concatenated =silicon institute of technologyI love my country
Concatenated result= silicon institute of technology from EEESecA
String1 starts with s
String4 =I love
String5 =eeeseca
String6 =EEESECA
silicon
institute
of
technology
*/
