class Account{
    private int accNo;
    private double accBbalance;
    Account(int accNo,double accBbalance)
    {
        this.accBbalance=accBbalance;
        this.accNo=accNo;
    }
    synchronized void deposit(double amt)
    {
        System.out.println("acc No.="+accNo);
        System.out.println("amount before deposit ="+accBbalance);
        accBbalance+=amt;
        System.out.println("amount after deposit ="+accBbalance);
        notify();
    }
}
class Thread1 extends Thread
{
    Account ob;
    double amt;
    Thread1(Account ob,double amt)
    {
        this.ob=ob;
        this.amt =amt;
    }
    public void run()
    {   
        ob.deposit(amt);
    }
}


public class ThreadBalanceAcc
{
    public static void main(String[] args) {
       Account ob=new Account(1234,2000);
       Thread1 t1=new Thread1(ob,300);
       t1.start();
       Account ob1=new Account(1235,9000);
       Thread1 t2 =new Thread1(ob1,900);
       t2.start();


    }
}

/* OUTPUT
acc No.=1234
acc No.=1235
amount before deposit =2000.0
amount before deposit =9000.0
amount after deposit =2300.0
amount after deposit =9900.0
*/