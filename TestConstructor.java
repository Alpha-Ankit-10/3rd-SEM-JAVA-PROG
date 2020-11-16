/*Demo of constructor*/

import java.util.*;

class DemoConstructor
{
	int no;
	String name;
	
	//CONTRUCTOR HAVE SAME NAME AS CLASS
	//NO METHOD TYPE FOR CONSTRUCTOR
	
	DemoConstructor()	//DEFAULT CONSTRUCTOR - self initialization
	{ //contructor with no argument
		no=62;
		name="Ankit";
	}
	
	//CONSTRUCTOR OVERLOADING WITH DIFFERENT PARAMETER LIST
	
	DemoConstructor(String name1,int no1) //PARAMETERIZED CONSTRUCTOR
	{ //constructor with argument
		name=name1;
		no=no1;
	}
	void show()
	{
		System.out.println("Name = "+name+"\t Roll = "+no);
	}
}

//PARAMETERIZED CONSTRUCTOR CAN BE USED ONLY IF DEFAULT CONSTRUCTOR IS DEFINED

class TestConstructor
{
	public static void main(String args[])
	{
		DemoConstructor ob= new DemoConstructor();//not passing argument
		System.out.println("Student details using default constructor :");
		ob.show();
		DemoConstructor ob1= new DemoConstructor("Shreeya",29);//passing argument
		System.out.println("Student details using PArameterized constructor :");
		ob1.show();
	}
}

//If no constructoris present,then compiler gives its own default value

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java TestConstructor
Student details using default constructor :
Name = Ankit     Roll = 62
Student details using PArameterized constructor :
Name = Shreeya   Roll = 29
*/