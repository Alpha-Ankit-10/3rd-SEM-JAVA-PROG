/*Q4b Employee details using constructor*/

import java.util.*;

class Employee
{
		String name;
		int empno;
		float basic,da,hra,gross;
		
		Employee(String name1,int empno1,float basic1)
		{
			name=name1;
			empno=empno1;
			basic=basic1;
			
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

class EmployeeDetailConstructor
{
	public static void main(String args[])
	{
		//Input of Details
		String name;
		int empno;
		float basic;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee name :");
		name= sc.nextLine();
		System.out.println("Enter Employee Number :");
		empno= sc.nextInt();
		System.out.println("Enter Employee Salary :");
		basic=sc.nextFloat();
	
		//Object creatation
		Employee ob1= new Employee(name,empno,basic);
			
		ob1.calGrossSal(ob1);
			
		//Display
		System.out.println("Details of Employees :");
		System.out.println("Name\tEmpNo\tBASIC\tDA\tHRA\tGROSS");
		ob1.showEmpDetails();
		
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java EmployeeDetailConstructor
Enter Employee name :
Ankit
Enter Employee Number :
3510
Enter Employee Salary :
5000
Details of Employees :
Name    EmpNo   BASIC   DA      HRA     GROSS
Ankit   3510    5000.0  1000.0  500.0   6500.0
*/