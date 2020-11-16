/*Tofind  prime numbers within the range of 10 to 150*/

class PrimeNo
{
	public static void main(String args[])
	{
		int i,j,flag;
		System.out.println("Prime Numbers are :");
		for(i=11;i<150;++i)
		{
			flag=1;
			for(j=2;j<i;++j)
			{
				if(i%j==0)
					flag=0;
			}
			if(flag==1)
				System.out.print(i+"\t");
		}
	}
}

/*
OUTPUT

E:\SEMESTER 3\Java\JAVA LAB PROG>java PrimeNo
Prime Numbers are :
11      13      17      19      23      29      31      37      41      43      47      53
        59      61      67      71      73      79      83      89      97      101     103
        107     109     113     127     131     137     139     149
*/