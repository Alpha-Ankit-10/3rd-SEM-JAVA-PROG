/*Find all the numbers satisfying the condition. Eg: 12 whose square is 144. Reverse of 144 is 441. Square root of 441 is 21 which is the reverse of original number 12*/

class SqrtRev
{
	public static void main(String args[])
	{
		int i,j,sq,revsq,rev,ld;
		double n;
		System.out.println("Numbers satisfying the condition:");
		for(i=1;i<1000;++i)
		{
			sq=i*i;
			revsq=0;
			for(j=sq;j!=0;j/=10) //reversing squared number
			{
				ld=j%10;
				revsq=(revsq*10)+ld;
			}
			n=Math.sqrt(revsq);
			rev=0;
			for(j=(int)n;j!=0;j/=10) //reversing number
			{
				ld=j%10;
				rev=(rev*10)+ld;
			}
			if(rev==i)
				System.out.print(rev+"\t");
		}
	}
}

/*
OUTPUT

E:\SEMESTER 3\Java\JAVA LAB PROG>javac SqrtRev.java

E:\SEMESTER 3\Java\JAVA LAB PROG>java SqrtRev
Numbers satisfying the condition:
1       2       3       11      12      13      21      22      31
101     102     103     111     112     113     121     122
201     202     211     212     221     301     311
*/