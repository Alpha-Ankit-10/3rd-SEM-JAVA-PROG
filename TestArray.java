/*Array Operation*/
import java.util.Scanner;

class TestArray
{
    public static void main(String[] args)
	{
		/*int arr[];//declaration
		arr = new int[15];//instantiation*/
		
		int arr[]= new int[15]; //declaration & instantiation
		int index,size;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		size=sc.nextInt();
		
		System.out.println("Enter Value of array: ");
		for (index=0;index<size;++index)
		{
			arr[index]=sc.nextInt();
		}
		System.out.println("Value of array: ");
		for (index=0;index<size;++index)
		{
			System.out.print(arr[index]+" ");
		}
	}
}