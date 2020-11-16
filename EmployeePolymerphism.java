/*Q1c Employee details using Inheritance implementing POLYMERPHISM*/

import java.util.*;

class Employee
{
		private String empName;
		private int empID;
		
		Employee()
		{
			empID=01;
			empName="Ankit";
		}
		
		Employee(String name1,int empno1)
		{
			empName=name1;
			empID=empno1;
		}
		
		void input()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Employee name");
			empName=sc.nextLine();
			System.out.println("Enter the EmployeeNumber");
			empID=sc.nextInt();
		}
				
		void display()
		{
			System.out.print(empName+"\t"+empID);
		}
}

class Manager extends Employee
{
	private double basic;
	private byte da,hra;
	double gross;
	
	Manager()
	{
		super();
		basic = 5000;
		da=100;
		hra=50;	
		gross=basic+da+hra;		
	}
	
	Manager(double basic1,byte da1,byte hra1)
	{
		//super(name1,empno1);
		basic=basic1;
		da=da1;
		hra=hra1;
		
		gross=basic1+da1+hra1;
	}
	
	void input()
	{
		//super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary");
		basic=sc.nextDouble();
		System.out.println("Enter the DA(<128)");
		da=sc.nextByte();
		System.out.println("Enter the HRA(<128)");
		hra=sc.nextByte();
		
		gross=basic+da+hra;
	}
	void calSal(Manager ob)	
	{
		gross=ob.basic+ob.da+ob.hra;
	}
	void display()
	{
		//super.display();
		System.out.println("\t\t"+basic+"\t"+da+"\t"+hra+"\t"+gross);
	}
}


class EmployeePolymerphism
{
	public static void main(String args[])
	{
		//Object creatation
		Employee ob; //Instance or Reference of parent class
						
		//Display
		System.out.println("Details of Employees :");
		ob = new Employee("ANkit Das",524);
		ob.display();
		ob = new Manager(6000d,(byte)120,(byte)60);//Upcasting
		ob.display();
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java EmployeePolymerphism
Details of Employees :
ANkit Das       524             6000.0  120     60      6180.0

*/