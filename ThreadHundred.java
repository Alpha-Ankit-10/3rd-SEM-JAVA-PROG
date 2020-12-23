class Loop
{
    
     synchronized static void looperAlpha(char ch)
     {
           for(int i=0;i<10;i++)
           {
               System.out.println(ch);
           }
     }
     synchronized static void looperNum(int n)
     {
        for(int i=0;i<10;i++)
        {
            System.out.println(n);
        }
     }

}

class Thread_1 extends Thread
{
    public void run()
    { 
       Loop.looperAlpha('A');
    }
}
class Thread2 extends Thread
{
    public void run()
    { 
       Loop.looperAlpha('B');
    }
}
class Thread3 extends Thread
{
    public void run()
    { 
       Loop.looperNum(100);
    }
}


public class ThreadHundred
{
    public static void main(String[] args) {
      
        Thread_1 t1=new Thread_1();
        Thread2 t2= new Thread2();
        Thread3  t3= new Thread3();
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){}
        t3.start();


    }
}
/*
OUTPUT
A
A
A
A
A
A
A
A
A
A
B
B
B
B
B
B
B
B
B
B
100
100
100
100
100
100
100
100
100
100
*/