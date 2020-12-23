import java.util.Scanner;
class Thread__1 extends Thread
{
    int n;
    Thread__1(int n)
    {
        this.n=n;
    }
    public void run()
    { 
        
            
        System.out.println("square ="+n*n);
    }
}
class Thread_2 extends Thread
{
    int n;
    Thread_2(int n)
    {
        this.n=n;
    }
    public void run()
    { 
        int f=1;
        for(int i=1;i<=n;i++)
            f=f*i;
     
        System.out.println("factorial = "+f);
        
    }
}

public class ThreadCompute
{
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n=sc.nextInt();
        Thread__1 t1=new Thread__1(n);
        Thread_2 t2= new Thread_2(n);
        t1.start();
        t2.start();


    }
}
/*
enter a no.
7
factorial = 5040
square =49

enter a no.
0
square =0
factorial = 1
*/