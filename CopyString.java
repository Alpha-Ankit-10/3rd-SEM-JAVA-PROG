/*Copy one string to another index by index*/

class CopyString
{
	public static void main(String args[])
	{
		String str1 = "Hello Java";
		int len = str1.length();
		char arr1[] = new char[len];
		char arr2[] = new char[len];
		str1.getChars(0,len,arr1,0);
		//Value is copied from string from string to charcater array
		System.out.println("Original string value = "+str1);
		int index;
		for(index=0;index<len;index++)
		{
			arr2[index] = arr1[index];
		}
		String str2 = new String(arr2);
		System.out.println("Copied string value = "+str2);
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java CopyString
Original string value = Hello Java
Copied string value = Hello Java
*/