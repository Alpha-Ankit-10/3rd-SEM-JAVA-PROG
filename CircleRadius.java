/*Radius of circle whose area is equal to area of rectangle of given side*/

class CircleRadius
{
	public static void main(String args[])
	{
		double a,b,r;
		a=100;
		b=314;
		
		r=Math.sqrt((a*b)/3.14);
		System.out.println("Rectangle Length="+a+" & breadth="+b);
		System.out.println("Circle Radius = "+r);
	}
}
/*
OUTPUT
E:\SEMESTER 3\Java\JAVA PROG>javac CircleRadius.java

E:\SEMESTER 3\Java\JAVA PROG>java CircleRadius
Rectangle Length=100.0 & breadth=314.0
Circle Radius = 100.0
*/