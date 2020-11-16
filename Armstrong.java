/*print all the Armstrong numbers within the range of 100 to 1000*/

class Armstrong
{
	public static void main(String args[])
	{
		int i=101,j,ctr,ar=0,ld;
		System.out.println("Armstrong are :");
		while(i!=1000)
		{
			for(ctr=i;ctr!=0;ctr/=10)
			{
				ld=(ctr%10);
				ar+=(ld*ld*ld);
			}
			if(ar==i)
				System.out.println(ar);
			++i;
			ar=0;
		}
	}
}

/*
OUTPUT

E:\SEMESTER 3\Java\JAVA LAB PROG>javac Armstrong.java

E:\SEMESTER 3\Java\JAVA LAB PROG>java Armstrong
Armstrong are :
153
370
371
407

*/