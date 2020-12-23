/*Use of autoboxing in Java*/

class TestAutoBoxing
{
	public static void main(String args[])
	{
		//Declare variable of priitive datatype
		int no = 500;
		Integer ob = Integer.valueOf(no);//Converting from int to Integer explicitly
		Integer ob1 = no;//Autoboxing or automatic conversion from int to Integer object
		System.out.println("Values are "+no+" "+ob+" "+ob1);
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java TestAutoBoxing.java
Values are 500 500 500
*/