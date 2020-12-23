/*Addition of two numbers using commandline argument*/

class AdditionCommandline
{
	public static void main(String args[])
	{
		int no1,no2,res;
		no1 = Integer.parseInt(args[0]);//Converts String to integer
		no2 = Integer.parseInt(args[1]);//Converts String to integer
		res = no1 +no2;
		System.out.println("Addition result = "+res);
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java AdditionCommandline 50 90
Addition result = 140
*/