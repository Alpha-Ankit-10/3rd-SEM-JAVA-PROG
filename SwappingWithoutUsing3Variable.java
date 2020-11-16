/*Swapping value without using third variable*/

class SwappingWithoutUsing3Variable
{
	public static void main(String args[])
	{
		int a,b;
		a=20;
		b=30;
		System.out.println("Before swapping a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a="+a+" b="+b);
	}
}

/*
OUTPUT
E:\SEMESTER 3\Java\JAVA PROG>javac SwappingWithoutUsing3Variable.java

E:\SEMESTER 3\Java\JAVA PROG>java SwappingWithoutUsing3Variable
Before swapping a=20 b=30
After swapping a=30 b=20
*/