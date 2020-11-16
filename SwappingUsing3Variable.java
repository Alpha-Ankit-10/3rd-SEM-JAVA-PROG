/*Swapping value using third variable*/

class SwappingUsing3Variable
{
	public static void main(String args[])
	{
		int a,b,c;
		a=20;
		b=30;
		System.out.println("Before swapping a="+a+" b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping a="+a+" b="+b);
	}
}

/*
OUTPUT
E:\SEMESTER 3\Java\JAVA PROG>javac SwappingUsing3Variable.java

E:\SEMESTER 3\Java\JAVA PROG>java SwappingUsing3Variable
Before swapping a=20 b=30
After swapping a=30 b=20
*/