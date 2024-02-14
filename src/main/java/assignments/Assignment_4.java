package assignments;

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {
		/*
		 * Write a program to read a weekday number between 1-7 and print weekday name using switch statement
		Input: 1
		Output: Monday

		Input : 7
		Output: Sunday
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entery input no. of days between 1-7 -");
		int days=sc.nextInt();
		
		switch(days)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		
		}
		sc.close();
	}

}
