/*Display the value in its corresponding word format using switch case*/

import java.util.Scanner;

class NumberWordM
{
  public static void main(String args[])
  {
    int a,ld,rev=0;
    char ch;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number:");
 
    Integer as = new Integer(sc.nextInt());
    String aString=Integer.toString(as);
    int i=0;
    while(i<aString.length())
      {
      
         ch=aString.charAt(i);
  
      switch(ch)
      {      

        case '0':                  
            System.out.print("ZERO ");  //Zero will not be printed if its the last digit
            break;
        case '1':
            System.out.print("ONE ");
            break;
        case '2':
            System.out.print("TWO ");
            break;
        case '3':
            System.out.print("THREE ");
            break;
        case '4':
            System.out.print("FOUR ");
            break;
        case '5':
            System.out.print("FIVE ");
            break;
        case '6':
            System.out.print("SIX ");
            break;
        case '7':
            System.out.print("SEVEN ");
            break;
        case '8':
            System.out.print("EIGHT ");
            break;
        case '9':
            System.out.print("NINE ");
            break;
        default:
            break;
      }
      i++;
    }
  //To print Zero if the last digit is zero
  }
}