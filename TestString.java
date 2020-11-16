/*String operations*/

class TestString
{
	static void concat1(String str1)
	{
		str1 = str1 +" Institute";
	}
	static void concat2(StringBuilder str1)
	{
		str1=str1.append(" Institute");
	}
	static void concat2(StringBuffer str1)
	{
		str1=str1.append(" Institute");
	}
	public static void main(String args[])
	{
		//Scanner sc = new Scanner(system.in);
		String str1="Silicon";
		concat1(str1); //Value of str1 cannot be changed b/c String class is immutable
		System.out.println("After concatenation string value = "+str1);
		
		StringBuilder str2 = new StringBuilder("Silicon");
		concat2(str2); //Value of str2 can be changed b/c StringBuilder class is mutable
		System.out.println("After concatenation string value using StringBuilder = "+str2);
		
		StringBuffer str3 = new StringBuffer("Silicon"); //Can be used it for multiple string
		concat2(str3); //Value of str3 can be changed b/c StringBuffer class is mutable
		System.out.println("After concatenation string value using StringBuffer = "+str3);
	}
}