/*Demo of  Copy constructor*/

import java.util.*;

class DemoCopyConstructor
{
	int no;
	String name;
	
	//CONTRUCTOR HAVE SAME NAME AS CLASS
	//NO METHOD TYPE FOR CONSTRUCTOR
	
	DemoCopyConstructor()	//DEFAULT CONSTRUCTOR - self initialization
	{ //contructor with no argument
		no=62;
		name="Ankit";
	}
	
	//CONSTRUCTOR OVERLOADING WITH DIFFERENT PARAMETER LIST
	
	DemoCopyConstructor(String name1,int no1) //PARAMETERIZED CONSTRUCTOR
	{ //constructor with argument
		name=name1;
		no=no1;
	}
	
	DemoCopyConstructor(DemoCopyConstructor ob) //COPY CONSTRUCTOR
	{
		name = ob.name;
		no = ob.no;
	}
	void show()
	{
		System.out.println("Name = "+name+"\t Roll = "+no);
	}
}

//PARAMETERIZED CONSTRUCTOR CAN BE USED ONLY IF DEFAULT CONSTRUCTOR IS DEFINED

class TestCopyConstructor
{
	public static void main(String args[])
	{
		DemoCopyConstructor ob= new DemoCopyConstructor();//not passing argument
		System.out.println("Student details using default constructor :");
		ob.show();
		
		DemoCopyConstructor ob1= new DemoCopyConstructor("Shreeya",29);//passing argument
		System.out.println("Student details using PArameterized constructor :");
		ob1.show();
		
		DemoCopyConstructor ob2= new DemoCopyConstructor(ob1);//passing argument
		System.out.println("Student details using Copy constructor :");
		ob2.show();
	}
}

//If no constructoris present,then compiler gives its own default value

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java TestCopyConstructor
Student details using default constructor :
Name = Ankit     Roll = 62
Student details using PArameterized constructor :
Name = Shreeya   Roll = 29
Student details using Copy constructor :
Name = Shreeya   Roll = 29
*/