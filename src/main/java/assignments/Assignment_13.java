package assignments;

import java.util.Scanner;

public class Assignment_13 {
	/*
	 *Write a Java program that takes a string as input and prints its reverse.
	 */
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string - ");
		String str=sc.next();
		
		int len=str.length();
		
		System.out.println("Length - "+len);
		
		System.out.print("Reverse String - ");
		
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		
		sc.close();
	}
		
	
	
}
