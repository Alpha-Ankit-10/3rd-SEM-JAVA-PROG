/*Area of triangle using 03 sides*/

class AreaTriangle
{
	public static void main(String args[])
	{
		double s,area;
		int a,b,c;
		a=30;
		b=40;
		c=50;
		s=(a+b+c)/2;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area = "+area);
	}
}

/*
OUTPUT

javac AreaTriangle.java

java AreaTriangle
Area = 600.0
*/