/*Q4 Employee details*/

import java.util.*;

class Employee
{
		String name;
		int empno;
		float basic,da,hra,gross;
		
		void input()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employee name :");
			name= sc.nextLine();
			System.out.println("Enter Employee Number :");
			empno= sc.nextInt();
			System.out.println("Enter Employee Salary :");
			basic=sc.nextFloat();
			da=0.2f*basic;
			hra=0.1f*basic;
		}
		
		void calGrossSal(Employee ob)	
		{
			gross=ob.basic+ob.da+ob.hra;
		}
		
		void showEmpDetails()
		{
			System.out.println(name+"\t"+empno+"\t"+basic+"\t"+da+"\t"+hra+"\t"+gross);
		}
}

class EmployeeDetail
{
	public static void main(String args[])
	{
		//Object creatation
		Employee ob1= new Employee();
		Employee ob2= new Employee();
	
		//Input of Details
		System.out.println("Enter Details of 1st Employee :");
		ob1.input();
		System.out.println("Enter Details of 2nd Employee :");
		ob2.input();
	
		ob1.calGrossSal(ob1);
		ob2.calGrossSal(ob2);
	
		//Display
		System.out.println("Details of Employees :");
		System.out.println("Name\tEmpNo\tBASIC\tDA\tHRA\tGROSS");
		ob1.showEmpDetails();
		ob2.showEmpDetails();
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java EmployeeDetail
Enter Details of 1st Employee :
Enter Employee name :
a
Enter Employee Number :
1
Enter Employee Salary :
50000
Enter Details of 2nd Employee :
Enter Employee name :
b
Enter Employee Number :
2
Enter Employee Salary :
40000
Details of Employees :
Name    EmpNo   BASIC   DA      HRA     GROSS
a       1       50000.0 10000.0 5000.0  65000.0
b       2       40000.0 8000.0  4000.0  52000.0
*/