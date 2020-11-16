/*Use of variable in java*/

class TestVariable1
{
	static int num= 60;//Static variable
	//Single memory is allocated this varibale
	
	int number=50;//Instance Variable
	//Each object will have its variable memory separetely
	
	void show()
	{
		int no=20;//local variable
		System.out.println("Value of the local variable is ="+no);
	}
	
	void display()
	{
		num++;//Class specific
		number++;//Object specific
		System.out.println("Inside display mode \nValue of instance variable is = "+number);
		System.out.println("Inside display mode \nValue of static variable is = "+num);
	}
}

class DemoVariable1
{
	public static void main(String args[])
	{
		TestVariable1 ob = new TestVariable1();
		ob.show();
		ob.display();
		//System.out.println("Inside main method \nValue of instance variable is  = "+ob.number);
		
		System.out.println("\nAfter increment of instance variable\n");
		TestVariable1 ob1 = new TestVariable1();
		ob1.display();
	}
}
	
/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java DemoVariable1
Value of the local variable is =20
Inside display mode
Value of instance variable is = 51
Inside display mode
Value of static variable is = 61

After increment of instance variable

Inside display mode
Value of instance variable is = 51
Inside display mode
Value of static variable is = 62
*/	