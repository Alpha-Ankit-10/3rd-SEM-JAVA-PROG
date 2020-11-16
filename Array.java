import java.util.Scanner;

public class Array{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		char[] ch;
		String str=sc.nextLine();
		ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			System.out.print((char)ch[i]+" ");
		}
	}
}