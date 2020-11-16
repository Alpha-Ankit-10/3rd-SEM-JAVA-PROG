/*USe of Exception Handling in java*/

class DemoException
{
	public static void main(String args[])
	{
		System.out.println("Program Starts");
		try
		{
		int no1=20,no2=10;   //Arithmatic exception (Divided by zero is not defined)
		int res;
		res=no1/no2;   //Object is thrown to the Catch
		System.out.println("Result is "+res);
		
		int no;
		String str="Ankit";
		no=Integer.parseInt(str);	//COmmandline argument
		System.out.println("VAlue is "+no);
		
		int arr[]={1,2,3,4};
		System.out.println("Value of arr[5] = "+arr[5]);  //Out of bound hence further exceution is not there if its more than 4
		System.out.println("End of try block without any exception being generated");
		}
		
	//No statement should not be written between try-catch block	
		
		catch(ArithmeticException ob)	//Multiple Catch blocks to check all types of exception
		{
			System.out.println("CAnnot divide by zero");
			System.out.println(ob);	//Gives predefined message of the type of exception
		}
		catch(NullPointerException ob)
		{
			System.out.println("Null Pointer Exception");
		}
		catch(ArrayIndexOutOfBoundsException ob)
		{	//Specific exception must be given if also generic exception is given
			System.out.println("Out of boundary of array size");
		}
		//Program must be specific to general in nature
		//Generic Exception should always be at the last
		catch(Exception ob)	//Generic Exception
		{
			System.out.println("Generic Exception");	//Handles All exceptions if any particular exceptionis not given in catch block
			System.out.println(ob);
			//but doesnt give specific type of exception
		}
		
		/*Outside Try-Catch block*/
		System.out.println("PRogram Over");
		System.out.println("Thank You");
	}
}