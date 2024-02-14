package assignments;

import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Assignment_18 {
	
	/*
	 * Write a Java program to check if a given string is a palindrome or not .
	 * Use scanner class.Palindrome is a word that reads the same backward as forward.
	 * Example : Madam,Level
	 */
	
	public static void main(String args[])
	{
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string -");
		String str=sc.next();
		
		//char str1[]=ch.toCharArray();
		
		System.out.println("Reverse string is - ");
		String newstr=null;
		
		for(int i=str.length()-1;i>=0;i--)
		{
			newstr=newstr+str.charAt(i);
			//System.out.print(str.charAt(i)); 
			//newstr=str.valueOf(i);
			System.out.print(newstr);
			}
		System.out.print(newstr);
		System.out.println();
		if(str.contentEquals(newstr))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		sc.close();
		
	}
	
	
}
