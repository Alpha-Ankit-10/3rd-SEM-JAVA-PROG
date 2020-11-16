/*Q2b complex number addition using constructor*/

import java.util.*;

class Complex1
{
	int real,img;
	
	Complex1()  //Default constructor
	{
		real=10;
		img=20;
	}
	
	Complex1(int real1,int img1)  //Parametrized constructor
	{
		real=real1;
		img=img1;
	}
	void addition(Complex1 obj1,Complex1 obj2)
	{
		real=obj1.real + obj2.real;
		img=obj1.img + obj2.img;
	}
	void display()
	{
		System.out.println("Result = "+real+" + "+img+"i");
	}
}
class ComplexAdditionConstructor
{
	public static void main(String args[])
	{
		//Object creatation
		Complex1 ob1 = new Complex1();//Default constructor
		int x,y;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter real n imaginary value resp :");
		x=sc.nextInt();
		y=sc.nextInt();
		Complex1 ob2 = new Complex1(x,y);//Parametrized constructor
		Complex1 ob3 = new Complex1();
				
		//Addition
		ob3.addition(ob1,ob2);
		
		//Displaying result
		ob3.display();
						
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java ComplexAdditionConstructor
ENter real n imaginary value resp :
60
40
Result = 70 + 60i
*/