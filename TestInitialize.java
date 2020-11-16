/*Initaialization of vasriable in method*/

import java.util.*;

class DemoIniatialize
{
	int no;
	void get()
	{
		no=20;
	}
	void show()
	{
		System.out.println("Value using method = "+no);
	}
	void get1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter VAlue :");
		no= sc.nextInt();
	}
}
class TestInitialize
{
	
	public static void main(String args[])
	{
		DemoIniatialize ob= new DemoIniatialize();
		ob.no=30;
		ob.show();
		
		DemoIniatialize ob1= new DemoIniatialize();
		ob1.get();
		ob1.show();
		
		DemoIniatialize ob2= new DemoIniatialize();
		ob2.get1();
		ob2.show();
		
	}
}