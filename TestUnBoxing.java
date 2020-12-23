/*Use of Unboxing in Java*/

class TestUnBoxing
{
	public static void main(String args[])
	{
		//Declare the object of class
		Integer ob = new Integer(25);
		int no = ob.intValue();//Explicitly converting from Integer to int
		int no1 = ob;//Unboxing i.e. automatic conversion from Integer to int
		System.out.println("Values are "+ob+" "+no+" "+no1);
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java TestUnBoxing
Values are 25 25 25
*/