/*Use of static block in java*/

class TestStaticBlock
{
	static  //used to initialize the static varibale
	{
		//Preprocessor method
		//method that gets executed before the main method
		System.out.println("First static block");		
	}
	static  //Multiple staticblock possible
	{
		System.out.println("2nd static block");		
	}
	
	public static void main(String args[]) //main method is necessary for execution of program
	{
		System.out.println("Inside main method");
	}
	
	static  //All staticblocks are executed first then it enters main method
	{
		System.out.println("3rd static block");		
	}
}

//if multiple staticblocks are presnt then all static methods executed sequentaially
//then main method is executed

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java TestStaticBlock
First static block
2nd static block
3rd static block
Inside main method
*/