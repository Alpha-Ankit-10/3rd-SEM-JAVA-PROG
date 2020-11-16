/*Q6 LINEAR queue implementation*/

import java.util.*;

class LinearQueueFunction
{
	int maxsize=10;
	int front=0,rear=-1,n,i;
	int q[]= new int[10];
	
	void insert(int q[],int ele)
	{
		if (rear==maxsize-1)
		{
			System.out.println("QUEUE IS FULL");
			System.exit(0);
		}
		else
		{
			++rear;
			q[rear]=ele;
		}
	}
	int delete(int q[])
	{
		if(front>rear)
		{
			System.out.println("QUEUE IS EMPTY");
			System.exit(0);
		}
		else
		{
			n=q[front];
			front++;
	
		}
		return n;
	}
	void display(int q[])
	{
		for(i=front;i<=rear;++i)
		{
			System.out.print(q[i]+"\t");
		}
		System.out.println();
	}
}

class LinearQueueOperation
{
	public static void main(String args[])
	{
		LinearQueueFunction ob = new LinearQueueFunction();
		int i,j,choice,ele,x,g;
		Scanner sc = new Scanner(System.in);
		System.out.println("Linear Queue IMPLEMENTATION :");
		for(g=1;;)
		{
			System.out.println("1=>insert\t 2=>delete\t 3=>display\t 4=>quit");
			System.out.println("Enter the choice");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.print("Enter the element: ");
					ele=sc.nextInt();
					ob.insert(ob.q,ele);
					break;
				case 2:
					x=ob.delete(ob.q);
					System.out.println("Element deleted= "+x);
					break;
				case 3:
					System.out.println("The queue is:");
					ob.display(ob.q);
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("Wrong input");
			}
		}
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java LinearQueueOperation
Linear Queue IMPLEMENTATION :
1=>insert        2=>delete       3=>display      4=>quit
Enter the choice
1
Enter the element: 11
1=>insert        2=>delete       3=>display      4=>quit
Enter the choice
1
Enter the element: 22
1=>insert        2=>delete       3=>display      4=>quit
Enter the choice
1
Enter the element: 33
1=>insert        2=>delete       3=>display      4=>quit
Enter the choice
3
The queue is:
11      22      33
1=>insert        2=>delete       3=>display      4=>quit
Enter the choice
2
Element deleted= 11
1=>insert        2=>delete       3=>display      4=>quit
Enter the choice
3
The queue is:
22      33
1=>insert        2=>delete       3=>display      4=>quit
Enter the choice
4
*/