/*Using java length*/

class TestArrayLength
{
	public static void main(String args[])
	{
		int arr[]={5,10,15,25,35,30,75};
		int index;
		System.out.println("Values of array are");
		for(index=0;index<arr.length;index++)
		{
			System.out.print(arr[index]+" ");
		}
		System.out.println(arr);//address of array arr
	}
}