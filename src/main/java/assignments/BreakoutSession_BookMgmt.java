package assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class BreakoutSession_BookMgmt {
	
	static int opt; 
	HashSet<BreakoutSession_BookClass> hs=new HashSet<BreakoutSession_BookClass>();
	
	public static void main(String[] args) {
		
		BreakoutSession_BookMgmt obj=new BreakoutSession_BookMgmt();
		
		
		Boolean status=true;
		while(status)
		{
			System.out.println("****Select opration from menu****");
			System.out.println("1. Add Book");
			System.out.println("2. Remove Book by ISBN");
			System.out.println("3. Search Book by ISBN");
			System.out.println("4. Display all books in the collection");
			System.out.println("5. Exit");
			Scanner sc=new Scanner(System.in);
			opt=sc.nextInt();
			switch(opt)
			{
			case 1:
				try {
					obj.addBook();
				} catch (BreakoutSession_InvalidPriceException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
				
			case 2:
				obj.removeBookByISBN();
				break;
				
			case 3:
				obj.searchBookByISBN();
				break;
			case 4:
				obj.displayAllBook();
				break;
			case 5:
				sc.close();
				System.out.println("Thank you for using book mgmt");
				System.exit(0);			
			}
			System.out.println("Do you want continue other operation?");
			String ans=sc.next();
			if(ans.equalsIgnoreCase("YES")||ans.equalsIgnoreCase("Y"))
			{
				status=true;
			}
			else
			{ 
				System.out.println("Thank you for using book mgmt");
				System.exit(0);
			}
	
		}

	}

	private void searchBookByISBN() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter ISBN to search book from collection");
		String ISBN=sc.next();
		Boolean check=true;
		
		for(BreakoutSession_BookClass obj1:hs)
		{
			if(obj1.getISBN().equals(ISBN))
			{
				System.out.println(obj1.getISBN());
				System.out.println(obj1.getTitle());
				System.out.println(obj1.getPrice());
				check=true;
				break;
			}
			else
			{
				check=false;
			}
		}
		if(check==false)
		{
		System.out.println("Book not found");
		}
	}

	private void removeBookByISBN() 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter ISBN to remove book from collection");
		String ISBN=sc.next();
		for(BreakoutSession_BookClass obj1:hs)
		{
			if(obj1.getISBN().equals(ISBN))
			{
				hs.remove(obj1);
				System.out.println("We have removed "+ISBN +" ISBN Book from collection");
			}
		}
				
		
	}

	private void addBook() throws BreakoutSession_InvalidPriceException {
		
		Scanner sc=new Scanner(System.in);
		Boolean check=true;
		
		while(check)
		{
			System.out.println("Enter book ISBN");
			String ISBN=sc.next();
			System.out.println("Enter book Title");
			String Title=sc.next();
			System.out.println("Enter book Price");
			double Price=sc.nextDouble();
			if(Price <= 0)
			{
				throw new BreakoutSession_InvalidPriceException("Please enter valid price");
			}
			else {
				
			BreakoutSession_BookClass addbook1=new BreakoutSession_BookClass(ISBN, Title, Price);
			hs.add(addbook1);
			}
			System.out.println("Do you want to add book Y/N ?");
			String ans=sc.next();
			if(ans.equalsIgnoreCase("YES")||ans.equalsIgnoreCase("Y"))
			{
				check=true;
			}
			else
			{
				break;
			}
		}
		
	}
	private void displayAllBook() {
		
		System.out.println("Books Available in collection :");
		int i=0;
		for(BreakoutSession_BookClass obj1:hs)
		{
			System.out.println("Book "+(i+1)+" - ");
			System.out.println(obj1.getISBN());
			System.out.println(obj1.getTitle());
			System.out.println(obj1.getPrice());
			i++;
		}
		
		
	}
 
}
