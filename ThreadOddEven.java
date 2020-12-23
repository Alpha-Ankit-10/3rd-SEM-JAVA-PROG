import java.util.Scanner;

class ThreadChild extends Thread{
    int m,n;
    ThreadChild(int m ,int n)
    {
        this.n=n;
        this.m=m;
        
        
    }
    public void run()
    {
        for(int i=m;i<=n;i+=1)
        {
            if(i%2==0){
              System.out.println("child="+i);}
              try{Thread.sleep(500);}
              catch(Exception e){}
              
        }

    }    
}
class ThreadParent extends Thread{
    int m,n;
    ThreadParent(int m ,int n)
    {
        this.n=n;
        this.m=m;
    }
  public void run()
  {
      for(int i=m;i<=n;i+=1)
      {
        
          
          if(i%2!=0){
            System.out.println("Parent="+i);}
            try{Thread.sleep(500);}
            catch(Exception e){}
            
      }

  }    
}

public class ThreadOddEven
{
  public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("enter  m and n");
      int m=sc.nextInt();
      int n = sc.nextInt();
      ThreadChild t1= new ThreadChild(m,n);
      ThreadParent t2= new ThreadParent(m,n);
      
      t1.start();
      try{Thread.sleep(100);}
      catch(Exception e){}
      t2.start();
  }
}
/* OUTPUT
enter  m and n
10 30
child=10
Parent=11
child=12
Parent=13
child=14
Parent=15
child=16
Parent=17
child=18
Parent=19
child=20
Parent=21
child=22
Parent=23
child=24
Parent=25
child=26
Parent=27
child=28
Parent=29
child=30
*/