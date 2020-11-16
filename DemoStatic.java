/*Use of static keyword*/

class TestStatic
{
	int value = 30;
	static int no=20;
	static void display()  //Static method
	{
		System.out.println("\nInside static method");
		//value=230;  // non-static variable value cannot be accessed by a static method
		no=220;
		//System.out.println("Instance variable Value ="+value);
		System.out.println("Static variable Value ="+no);
	}
	void show() //Non-static method
	{
		System.out.println("\nInside Non-static method");
		value=130;
		no=120;
		System.out.println("Instance variable Value ="+value);
		System.out.println("Static variable Value ="+no);
	}
}

class DemoStatic
{
	public static void main(String args[])  //Compiler direct calls main method so its made static
	{
		TestStatic ob= new TestStatic();
		ob.show(); //object is required to call the non-static method
		TestStatic.display();  //object is required NOT to call the non-static method
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java DemoStatic

Inside Non-static method
Instance variable Value =130
Static variable Value =120

Inside static method
Static variable Value =220
*/