package assignments;

import java.util.Scanner;

public class BreakoutSession_BasicCalc {
	
	public static void main(String[] args)
	{
		int result=0;
		boolean status=true;
		
		while(status)
		{
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter 1st number");
			int num1=sc1.nextInt();
			
			System.out.println("Enter 2nd number");
			int num2=sc1.nextInt();
			
			System.out.println("Enter Operand - + , - ,*, / ");
			String ch=sc1.next();
		switch(ch)
		{
		case "+":
			result=num1+num2;
			System.out.println("Addition is - "+result);
			break;
			
		case "-":
			result=num1-num2;
			System.out.println("Sub. is - "+result);
			break;
			
		case "*":
			result=num1*num2;
			System.out.println("Multiplication is - "+result);
			break;
			
		case "/":
			result=num1/num2;
			System.out.println("Divison. is - "+result);
			break;	
		}
		
		System.out.println("Do u wish to continue");
		String wish=sc1.next();
		if(wish.equalsIgnoreCase("Y")||wish.equalsIgnoreCase("y"))
			{
				status=true;
			}
		else
			{
			System.out.println("Thank you for using calc");			
			break;
			
			}
	}
	
	}

}
