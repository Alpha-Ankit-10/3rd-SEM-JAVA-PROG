import java.io.*;
import java.util.Scanner;

public class FilesInteger {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int n;String s="";
        FileOutputStream fout=new FileOutputStream("E:\\integer.txt");
        System.out.println("Enter the integers. Press any Alphabet to exit");
        while(true)
        {
            try{
            n=sc.nextInt();
            s=s+Integer.toString(n)+" ";}
            catch(Exception e){
                break;
            }
        }

        
        byte b[]=s.getBytes();
        System.out.println(" the nos. stored in integer.txt are :"+ s);
        
        fout.write(b);
        fout.close();
       
        FileOutputStream fouto=new FileOutputStream("E:\\odd.txt");//files to store odd nos
         FileOutputStream foute=new FileOutputStream("E:\\even.txt");//file to store even nos
        FileInputStream fis = new FileInputStream("E:\\integer.txt");//file containing all nos
        int i=0;String ns="";
        while((i=fis.read())!=-1)
        {
            if((char)i!=' ')
                ns=ns+(char)i;
            else{
                int ni=Integer.parseInt(ns);
                ns=ns+" ";
                if(ni%2==0){
                   
                      byte be[]=ns.getBytes();
                      foute.write(be);
                }
                else{
                    byte bo[]=ns.getBytes();
                    fouto.write(bo);
                }
                ns="";
                }
            }  
            fis.close();
            fouto.close();
            foute.close();
        } 
    }

/*
OUTPUT
the nos. stored in integer.txt are :3 4 65 1993 3 21 2
*/
//the odd and even nos are stored in their respective files
