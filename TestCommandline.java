/*CommandLine argument in java*/
class TestCommandline
{
	public static void main(String args[])
	{
		int a,b,res;					
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		res=a+b;
		System.out.println("Sum of "+a+" & "+b+" is "+res);
		//i/p- java TestCommandline *a* *b*
	}
}