/*Roots of quadratic equation*/

class RootQuad
{
	public static void main(String args[])
	{
		int a,b,c;
		double d,x1,x2;
		a=3;
		b=4;
		c=1;
		d=Math.sqrt((b*b)-(4*a*c));
		if(d>0)
		{
			x1=((-1*b)+d)/(2*a);
			x2=((-1*b)-d)/(2*a);
			System.out.println("Unique Roots are "+x1+" & "+x2);
		}
		else if(d==0)
		{
			x1=(-1*b)/(2*a);
			x2=x1;
			System.out.println("Same Roots are "+x1+" & "+x2);
		}
		else
		{
			System.out.println("Roots are COMPLEX");
		}
	}
}
/*
OUTPUT

E:\SEMESTER 3\Java\JAVA PROG>javac RootQuad.java

E:\SEMESTER 3\Java\JAVA PROG>java RootQuad
Unique Roots are -0.3333333333333333 & -1.0

*/