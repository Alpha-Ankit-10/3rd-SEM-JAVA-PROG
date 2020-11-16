/*Use of Non-static block in java*/

class TestNonStaticBlock
{
	static  //Not dependant on object creation
	{
		System.out.println("1 - First static block");		
	}
		//non static block only have pair of brackets
	{
		System.out.println("3 - First Non-static block");	//it is called after the object is created	
	}
		//Multiple Non static block is possible
	{
		System.out.println("4 - Second Non-static block");	
	}
	TestNonStaticBlock()
	{
		System.out.println("6 - Default contructor in java");		
	}
	public static void main(String args[]) //main method is necessary for execution of program
	{
		System.out.println("2 - Inside main method");
		
		System.out.println("\nBefore creation of first object\n");
		TestNonStaticBlock ob = new TestNonStaticBlock();
		
		System.out.println("\nBefore creation of Second object\n");
		TestNonStaticBlock ob1 = new TestNonStaticBlock();
	}
		//Exectutes sequential just after main method
	{
		System.out.println("5 - Third Non-static block");	
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java TestNonStaticBlock
1 - First static block
2 - Inside main method

Before creation of first object

3 - First Non-static block
4 - Second Non-static block
5 - Third Non-static block
6 - Default contructor in java

Before creation of Second object

3 - First Non-static block
4 - Second Non-static block
5 - Third Non-static block
6 - Default contructor in java
*/