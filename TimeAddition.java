/*Q3a Timing Addition in HR:MIN:SEC*/

import java.util.*;

class Time
{
	int hr,min,sec;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter HOUR :");
		hr=sc.nextInt();
		System.out.println("Enter MINUTE :");
		min=sc.nextInt();
		System.out.println("Enter SECONDS :");
		sec=sc.nextInt();
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
class TimeAddition
{
	public static void main(String args[])
	{
		//Object creatation
		Time ob1 = new Time();
		Time ob2 = new Time();
		Time ob3 = new Time();
		
		//Object Input
		System.out.println("Enter 1st Complex number :");
		ob1.input();
		System.out.println("Enter 2nd Complex number :");
		ob2.input();
		
		//Addition
		ob3.addition(ob1,ob2);
		
		//Displaying result
		ob3.display();
						
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java TimeAddition
Enter 1st Complex number :
Enter HOUR :
2
Enter MINUTE :
35
Enter SECONDS :
45
Enter 2nd Complex number :
Enter HOUR :
3
Enter MINUTE :
30
Enter SECONDS :
40
Result Time = 6 HOUR : 6 MINUTE : 25 SECOND
*/