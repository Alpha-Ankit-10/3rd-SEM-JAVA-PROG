import java.util.Scanner;

public class SubStringLast{
    public static void main(String[] args){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter string : ");
		String str =sc.nextLine();
		System.out.println("ENter the no. to be printed from last : ");
		n=sc.nextInt();
		String substr = str.substring(str.length()-n,str.length());
		System.out.println(substr);
	}
}