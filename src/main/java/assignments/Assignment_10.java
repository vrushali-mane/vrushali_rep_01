package assignments;

import java.util.Scanner;

public class Assignment_10 {
	/*
	 *Write a Java program that searches for a specific element in an integer array. The program should have the following features:
	 *Create an integer array with elements of your choice.
	 *Prompt the user to enter a value to search for.
	 *Check if the entered value exists in the array.
	 *Print a message indicating whether the value is found or not.
	 */
	public static void main(String args[])
	{
		int arr[]= {10,23,82,12,50,60};
		boolean status=false;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. to Search from Array -");
		int search=sc.nextInt();
		for(int i=0;i<=arr.length - 1;i++)
		{
			if(arr[i]==search)
			{
				status=true;	
				break;
			}
		
		}
		if(status)
		{
			System.out.println("No. is found");
		}
		else
		{
			System.out.println("No. is not found");
		}
		sc.close();
	}
	
}
