import java.io.*;
import java.util.Scanner;



public class FilesCharacter {
    public static void main(String[] args) throws IOException {

        FileOutputStream fout= new FileOutputStream("E:\\new.txt");
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        byte b[]=s1.getBytes();
        fout.write(b);
       fout.close();

       
        FileInputStream fin = new FileInputStream("E:\\new.txt");
        int i=0;String s="";
        while((i=fin.read())!=-1)
        {
            s=s+(char)i;
        }
        System.out.println("no of characters = "+s.length());
        int space=0,lower=0,upper=0;
        for(int j=0;j<s.length();j++)
        {
            char ch=s.charAt(j);
            if(ch==' ')
            {
               space++;
            }
            if(ch>='a' && ch<='z')
            {
                lower++;
            }
            if(ch>='A' && ch<='Z'){
                upper++;
            }
        }
    System.out.println("no of spaces ="+space);
    System.out.println("no of words ="+(space-1));
    System.out.println("no of lower ="+lower);
    System.out.println("no of upper ="+upper);
    fin.close();
    
    
    

    }
}
