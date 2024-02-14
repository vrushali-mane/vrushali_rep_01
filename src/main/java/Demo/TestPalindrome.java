package Demo;

import java.util.Scanner;

public class TestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter string");
		String str=sc.next();
		int length=str.length();
		Boolean strmatch=true;
		for(int i=0;i<=str.length()-1;i++)
		{
				if(str.charAt(i)!=str.charAt(length-1-i))
				{
					System.out.println("String is not palindrome");					
					strmatch=false;
					break;
				}
			
		}
		
		if(strmatch)
		{
			System.out.println("String is palindrome");
		}
	
		
	}

}
