/*Q5 Implementing STack operation using MEnu driven program*/

import java.util.*;

class StackFunction
{
	int maxsize=10,top=-1;
	int s[]= new int[10];
	int e;
	Scanner sc = new Scanner(System.in);
	
	void push(int s[],int e)
	{
		if(top==maxsize+1)
		{
			System.out.println("Stack Overflow");
			System.exit(0);
		}
		else
		{
			top++;
			s[top]=e;
		}
	}
	int pop(int s[])
	{
		
		if(top==-1)
		{
			System.out.println("STack Underflow");
			System.exit(0);
		}
		else
		{
			e=s[top];
			top--;
		}
		return e;
	}
	void display(int s[])
	{
		int t=top;
		if(t==-1)
			System.out.println("STack Is EMPTY");
		else
		{
			while(t>-1)
			{
				System.out.println(s[t]+"\t");
				t--;
			}
		}
	}

}

class StackOperation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		StackFunction ob = new StackFunction();
		int choice,ele,x,i;
		System.out.println("STACK IMPLEMENTATION :");
		for(i=1;i>0;)
		{
			System.out.println("1.PUSH\t2.POP\t3.DISPLAY\t4.QUIT");
			System.out.println("ENter your choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("ENter element:");
					ele=sc.nextInt();
					ob.push(ob.s,ele);
					break;
				case 2:
					x=ob.pop(ob.s);
					System.out.println(x+" is Deleted");
					break;
				case 3:
					System.out.println("The STACK :");
					ob.display(ob.s);		
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("WRONG OPTION");		
					break;
			}
		}
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java StackOperation
STACK IMPLEMENTATION :
1.PUSH  2.POP   3.DISPLAY       4.QUIT
ENter your choice :
1
ENter element:
10
1.PUSH  2.POP   3.DISPLAY       4.QUIT
ENter your choice :
1
ENter element:
20
1.PUSH  2.POP   3.DISPLAY       4.QUIT
ENter your choice :
1
ENter element:
30
1.PUSH  2.POP   3.DISPLAY       4.QUIT
ENter your choice :
3
The STACK :
30
20
10
1.PUSH  2.POP   3.DISPLAY       4.QUIT
ENter your choice :
2
30 is Deleted
1.PUSH  2.POP   3.DISPLAY       4.QUIT
ENter your choice :
3
The STACK :
20
10
1.PUSH  2.POP   3.DISPLAY       4.QUIT
ENter your choice :
4
*/
