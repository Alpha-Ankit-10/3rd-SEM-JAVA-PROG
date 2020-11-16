/*Using java length in for loop*/

class TestArrayFor
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
		System.out.println("\nValues of array are again\n");
		for(int index1:arr)
		{
			System.out.print(arr[index1]+" ");
		}
	}
}