/*Library program*/

import java.util.*;

class Book
{
	String bookName,AuthorName;
	int bookNo,NoofPages;
	float price;
			
	void addBook()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book name :");
		bookName= sc.nextLine();
		System.out.println("Enter Book Number :");
		bookNo= sc.nextInt();
		System.out.println("Enter Number of Pages in book :");
		NoofPages= sc.nextInt();
		System.out.println("Enter Book Price :");
		price=sc.nextFloat();
		System.out.println("Enter Author's name :");
		sc.nextLine();
		AuthorName= sc.nextLine();  
	}
		
	void showBookInfo()
	{
		System.out.println(bookName+"\t"+bookNo+"\t"+NoofPages+"\t"+price+"\t"+AuthorName);
	}
}

class Library
{
	public static void main(String args[])
	{
		int n,i;
				
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of books to be entered :");
		n=sc.nextInt();
		//Object creatation
		Book ob[]=new Book[n];
					
		//Input of Details
		for(i=0;i<n;++i)
		{
			ob[i] = new Book();//Initialization of each object
			System.out.println("Enter Details of "+(i+1)+" book :");
			ob[i].addBook();
		}
		
	
		//Display
		System.out.println("Details of Books :");
		System.out.println("Book Name\tBookNo\tNo of Pages\t\tPrice\tAuthor Name");
		for(i=0;i<n;++i)
		{
			ob[i].showBookInfo();
		}
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java Library
Number of books to be entered :1
Enter Details of 0 book :
Enter Book name :
JAVA
Enter Book Number :
1
Enter Number of Pages in book :
500
Enter Book Price :
999.99
Enter Author's name :
SPN
Details of Books :
Book Name       BookNo  No of Pages     Price   Author Name
JAVA    1       500     999.99  SPN
*/