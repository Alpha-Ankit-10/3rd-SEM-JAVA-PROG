/*Q2 Insufficient bank balance exception handling*/

import java.util.*;

class InsufficientFundException extends Exception
{
	String str;
	InsufficientFundException(String st)
	{
		str=st;
	}
	public String toString()
	{
		return("Balance Status : "+str);		
	}
}
class BankBalanceException
{
	static void WithdrawBal(float draw,float balance) throws InsufficientFundException
	{
		float rem=balance;
		if(draw>balance)
		{
			throw new InsufficientFundException("Insufficient");
		}
		else
		{
			rem=balance-draw;
			System.out.println("Please wait for the transaction");
			System.out.println("Amount has been processed");
			System.out.println("Remaining Balance : "+rem);
		}
	}
	public static void main(String args[])
	{
		try
		{ 
			float bal=10000f,withdraw;
			Scanner sc = new Scanner(System.in);
			System.out.println("BALANCE : "+bal);
			System.out.println("Enter Withdraw amount:");
			withdraw = sc.nextFloat();
			WithdrawBal(withdraw,bal);
		}
		catch(InsufficientFundException ob)
		{
			System.out.println("Transaction Error:\n"+ob);		
		}
		finally
		{
			System.out.println("Thank you for Banking");
		}
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java BankBalanceException
BALANCE : 10000.0
Enter Withdraw amount:
6000
Please wait for the transaction
Amount has been processed
Remaining Balance : 4000.0
Thank you for Banking

E:\SEMESTER 3\Java\JAVA LAB PROG>java BankBalanceException
BALANCE : 10000.0
Enter Withdraw amount:
60000
Transaction Error:
Balance Status : Insufficient
Thank you for Banking
*/