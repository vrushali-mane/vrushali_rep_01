package assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class BreakoutSession_Studentmgmt {
	
	public static void main(String[] args)
	{
		/*ArrayList<Integer> studID=new ArrayList<Integer>();
		ArrayList<String> firstName=new ArrayList<String>();
		ArrayList<String> lastName=new ArrayList<String>();
		ArrayList<String> email=new ArrayList<String>();
		ArrayList<String> course=new ArrayList<String>();*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many student do want to enroll");
		int count = sc.nextInt();
		
		int[] studID=new int[count];
		String[] firstName=new String[count];
		String[] lastName=new String[count];
		
		
		
	
		for(int i=0;i<count;i++)
		{	
			System.out.println("Enter Student details =");
		System.out.println("Enter Stud ID -");
		studID[i]=sc.nextInt();
			
		System.out.println("Enter First name -");
		firstName[i]=sc.next();
		
		System.out.println("Enter Last name -");
		lastName[i]=sc.next();
		
		/*System.out.println("Enter email id -");
		email=sc.next();
		
		System.out.println("Enter Course name -");
		course=sc.next();*/
		}
		
		System.out.println("Student enrolledment details =");
		for(int j=0;j<count;j++)
		{		
			System.out.println("Stud id - "+studID[j]);
			System.out.println("First name - "+firstName[j]);
			System.out.println("Last name - "+lastName[j]);
		}
				
	
	}
	
	

}
