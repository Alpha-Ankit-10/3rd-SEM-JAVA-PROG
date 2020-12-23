class GCDLCMCommandline
{
	public static void main(String args[])
	{
		int num1,num2;
		int temp1,temp2,gcd,lcm;
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		temp1 = num1;
		temp2 = num2;
		while(num1 != num2)
		{
			if(num1 > num2)
			{
				num1 = num1 - num2;
			}
			else
			{
				num2 = num2 - num1;
			}
		}
		gcd = num1;
		lcm = (temp1 * temp2)/gcd;
		System.out.println("The GCD and LCM of "+temp1+" and "+temp2+"  are "+gcd+","+lcm);
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java GCDLCMCommandline 20 25
The GCD and LCM of 20 and 25  are 5,100
*/