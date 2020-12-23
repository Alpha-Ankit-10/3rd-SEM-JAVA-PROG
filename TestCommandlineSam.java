/*Use of commandline argument for addition of two numbers in Java*/

class TestCommandlineSam
{
	public static void main(String args[])
	{
		//In Commandline the values should be given for args
		
		int num1,num2,res;
		System.out.println("Number of arguments passed through commandline = "+args.length);
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		res = num1 + num2;
		System.out.println("Sum of "+num1+" and "+num2+" is "+res);
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java TestCommandlineSam 10 20 30
Number of arguments passed through commandline = 3
Sum of 10 and 20 is 30
*/