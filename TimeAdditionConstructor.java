/*Q3a Timing Addition in HR:MIN:SEC using CONSTRUCTOR*/

import java.util.*;

class Time
{
	int hr,min,sec;
	
	Time() //Default Constructor
	{}
	
	Time(int h,int m,int s) //Paramertised Constructor
	{
		hr=h;
		min=m;
		sec=s;
	}
	
	void addition(Time ob1,Time ob2)
	{
		hr=0;
		min=0;
		sec=0;
		if(ob1.sec+ob2.sec>=60)
		{
			min++;
			sec=(ob1.sec+ob2.sec)-60;
		}
		else
			sec=(ob1.sec+ob2.sec);
		if(ob1.min+ob2.min>=60)
		{
			hr++;
			min+=(ob1.min+ob2.min)-60;
		}
		else
			min+=(ob1.min+ob2.min);
		
		hr+=ob1.hr+ob2.hr;		
	}
	void display()
	{
		System.out.println("Result Time = "+hr+" HOUR : "+min+" MINUTE : "+sec+" SECOND");
	}
}
class TimeAdditionConstructor
{
	public static void main(String args[])
	{
		//Data Input
		int hh1,mm1,ss1,hh2,mm2,ss2;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1st TIMING:\n");
		System.out.println("Enter HOUR :");
		hh1=sc.nextInt();
		System.out.println("Enter MINUTE :");
		mm1=sc.nextInt();
		System.out.println("Enter SECONDS :");
		ss1=sc.nextInt();
		System.out.println("\n2nd TIMING:\n");
		System.out.println("Enter HOUR :");
		hh2=sc.nextInt();
		System.out.println("Enter MINUTE :");
		mm2=sc.nextInt();
		System.out.println("Enter SECONDS :");
		ss2=sc.nextInt();
		
		//Object creatation
		Time ob1 = new Time(hh1,mm1,ss1);
		Time ob2 = new Time(hh2,mm2,ss2);
		Time ob3 = new Time();
		
		//Addition
		ob3.addition(ob1,ob2);
		
		//Displaying result
		ob3.display();
						
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java TimeAdditionConstructor

1st TIMING:

Enter HOUR :
3
Enter MINUTE :
30
Enter SECONDS :
50

2nd TIMING:

Enter HOUR :
2
Enter MINUTE :
45
Enter SECONDS :
30
Result Time = 6 HOUR : 16 MINUTE : 20 SECOND
*/