import java.io.*;
import java.util.Scanner;
public class FilesSubstring {
    public static void main(String[] args) throws IOException {

        FileInputStream dis=new FileInputStream("E:\\copyTo.txt"); //this file contains the text "Hello how are you"
        Scanner sc =new Scanner(System.in);        
        int i=0;String s="";int words=0;
        try{
        while((i=dis.read())!=-1){
            s=s+(char)i;
            if((char)i==' '){
                words++;
            }
        }
        System.out.println("NO of words are ->"+(words+1));
        System.out.println("enter the substring to be searched");
        String ss=sc.nextLine();       
        if(s.contains(ss))
            System.out.println("Word present");
        else
            System.out.println("word not present");
            
        dis.close();
    }
    catch(Exception e){}
}
}
/*
OUTPUT ->
1>
NO of words are ->6
enter the substring to be searched
ar
Word present

2>
NO of words are ->6
enter the substring to be searched
yu
word not present
*/ 