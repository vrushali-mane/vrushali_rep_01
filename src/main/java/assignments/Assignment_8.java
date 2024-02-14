package assignments;

import java.util.Scanner;

public class Assignment_8 {
	/*
	 * Write a Java program that uses a for loop to print the multiplication table of a given number.
     * Input number is 6.
	 */
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter no.");
	int num=sc.nextInt();
	
	for(int i=1;i<=10;i++)
	{
		int multiplication=num*i;
		System.out.println(num+" X "+i+" = "+multiplication);
	}
	sc.close();
	}
	

}
