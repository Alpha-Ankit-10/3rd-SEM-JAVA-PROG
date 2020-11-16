/*String comparison*/

class TestStringCompareContent
{
	public static void main(String args[])
	{
		String str1 = "Shree";
		String str2 = new String("Shree");
		if(str1.equals(str2))//Contents will be compared
		{
			System.out.println("Both string values are same");
		}
		else
		{
			System.out.println("Both string values are not same");
		}
	}
}