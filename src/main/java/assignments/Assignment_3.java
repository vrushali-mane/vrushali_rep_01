package assignments;

import java.util.Scanner;

public class Assignment_3 {
	/*Write a Java program that takes three numbers from the user and prints the greatest number.Use nested if.Test Data
	Input the 1st number: 25
	Input the 2nd number: 78
	Input the 3rd number: 87
	Expected Output :
	The greatest: 87
	 * 
	 */
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no. - ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd no. - ");
		int b=sc.nextInt();
		System.out.println("Enter 3rd no. - ");
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("The greatest no. - "+a);
		}
		else if(b>c && b>a)
		{
			System.out.println("The greatest no. - "+b);
		}
		else if(c>a && c>b)
		{
			System.out.println("The greatest no. - "+c);
		}
	sc.close();
	}

}
