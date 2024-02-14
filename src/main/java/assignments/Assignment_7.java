package assignments;


public class Assignment_7 {
	/*
	 * Write a Java program that uses a do-while loop to calculate the sum of the first 10 numbers
	 */
	public static void main(String args[])
	{
	int i=1,sum=0;
	
	do
	{
		sum=sum+i;
		i++;
	}while(i<=10);
	
	System.out.println("Sum of first 10 numbers - "+sum);
	}

}
