import java.util.Scanner;

public class UpperLowerCase{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		str=str.toUpperCase();
		System.out.println("Upper Case : ");
		System.out.println(str);
		System.out.println("Lower Case : ");
		System.out.println(str.toLowerCase());
	}
}