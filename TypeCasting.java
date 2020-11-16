/*Type Casting*/

class Widening
{
	int num = 100;
	double value = num; //Widening
	void show()
	{
		
		System.out.println("Widening \nInteger = "+num);
		System.out.println("Value = "+value);
	}
}

class Narrowing
{
	double value = 1052.235; 
	int num = (int)value; //Narrowing
	void show()
	{
		System.out.println("Narrowing \nInteger = "+num);
		System.out.println("Value = "+value);
	}
}

class TypeCasting
{
	public static void main(String args[])
	{
		Widening ob = new Widening();
		Narrowing ob1 = new Narrowing();
		ob.show();
		ob1.show();
	}
}
/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java TypeCasting
Widening
Integer = 100
Value = 100.0
Narrowing
Integer = 1052
Value = 1052.235
*/