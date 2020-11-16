/*Convert second to hr,min&sec*/

class TimeConverter
{
	public static void main(String args[])
	{
		int hr,min,sec,t,x;
		t=4444;
		x=t;
		hr=t/3600;
		t%=3600;
		min=t/60;
		t%=60;
		sec=t;
		System.out.println("Sec="+x+" => Time "+hr+":"+min+":"+sec);
	}
}

/*
OUTPUT
E:\SEMESTER 3\Java\JAVA PROG>javac TimeConverter.java

E:\SEMESTER 3\Java\JAVA PROG>java TimeConverter
Sec=4444 => Time 1:14:4
*/