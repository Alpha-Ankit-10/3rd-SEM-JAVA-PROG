public class Q7
{
	public static void main(String args[])
	{
	   int i,j,n=5,count=1,temp=0;
	   for(i=1;i<=n;i++)
	   {
		   if(i%2==0)
		   {
			   temp=count+i-1;
			   for(j=1;j<=i;j++)
			   {
				   //while(temp>=0)
				   //{
					   //System.out.printf("%d\t",count+temp);
					   //temp--;
				   //}
				   System.out.print(temp+"\t");
				   --temp;
			   }
			  count+=i;
		   }
		   else
		   {
			   for(j=1;j<=i;j++)
			   {
				   System.out.print(count + "\t");
				   count++;
			   }
		   }
		   System.out.println("");
	   }
	}
}