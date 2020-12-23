import java.io.*;

public class FilesCopy {
    public static void main(String[] args) throws IOException {
        //reading from a file
        FileInputStream fis= new FileInputStream("E:\\copyFrom.txt");
        int i=0;String s="";
        while((i=fis.read())!=-1)
        {
            s=s+(char)i;
        }
        fis.close();
        
        //copying to other file
        FileOutputStream fout=new FileOutputStream("E:\\copyTo.txt");
        byte b[]=s.getBytes();
        fout.write(b);
        fout.close();
        

    }
}
