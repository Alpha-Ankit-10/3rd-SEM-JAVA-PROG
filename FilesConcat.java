import java.io.*;
import java.util.Scanner;

public class FilesConcat {
    public static void main(String[] args) throws IOException {
        FileInputStream fis1=new FileInputStream("E://copyFrom.txt"); // First file
        FileInputStream fis2=new FileInputStream("E://copyTo.txt"); //Second File
        FileOutputStream fout = new FileOutputStream("E://newMerge.txt"); //concat file

        
        int i=0;String s="";String s1="";
        while((i=fis1.read())!=-1)
            s=s+(char)i;
        System.out.println("contents of 1st file :" +s);
        s=s+" ";
        while((i=fis2.read())!=-1){
            s=s+(char)i;
            s1=s1+(char)i;
        }
        System.out.println("contents of 2nd file :"+s1);
        fis2.close();
        fis1.close();
        byte b[]=s.getBytes();
        fout.write(b);
        System.out.println("contents of 3rd file :"+s);
        
        fout.close();

        


        
    }
  

    }
/*
contents of 1st file :Hi this is the text file from which i have to copy.
contents of 2nd file :Hello how are he he he
contents of 3rd file :Hi this is the text file from which i have to copy. Hello how are he he he

*/