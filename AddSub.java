import java.util.Scanner;

public class AddSub {
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        char ch;
        do{
            System.out.println("ENter A for addition\nS for substraction\nC for exit:");
            ch=sc.next().charAt(0);
            switch(ch){
                case 'a':
                case 'A':
                        System.out.println(a+b);
                        break;
                case 's':
                case 'S':
                        System.out.println(a-b);
                        break;      
                default:
                        System.out.println("Exiting prog"); 
			}			
            }while(ch!='c');
        }
    }

