package assignments;

import java.util.Scanner;

public class Assignment_17 {
	
	/*
	 * Write a java program to generate and print the Fibonacci series up to a given number n.
	 * n is the input number from user .Use Scanner class for this.
	 * Fibonacci series :0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
	 * Fibonacci series will be printed till the number 'n'.
	 */
	
	public static void main(String args[])
	{
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter nth number -");
		int n=sc.nextInt();
		
		int fib=0,num1=0,num2=1;
	
		System.out.print(num1+","+num2);
		
		for(int i=2;i<n;i++)
			{			
			fib=num1+num2;			
			num1=num2;
			num2=fib;		
			System.out.print(","+fib);
			}
		sc.close();
		
	}
	
	
}
