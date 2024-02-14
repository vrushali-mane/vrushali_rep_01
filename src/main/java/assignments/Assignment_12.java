package assignments;


public class Assignment_12 {
	/*
	 *Count and print the number of uppercase letters, lowercase letters, digits, and special characters (non-alphanumeric) present in the char array.
	 *Input :
	 *char[] arr = {'H', 'e', 'l', 'l', 'o', '1', ' ', 'W', 'o', 'r', 'l', 'd', '!', '@', '#'}
	 *Output :
	 *Uppercase Letters: 2
	 *Lowercase Letters: 8
	 *Digits: 1
	 *Special Characters: 3
	 */
	public static void main(String args[])
	{
		char arr[] = {'H', 'e', 'l', 'l', 'o', '1', ' ', 'W', 'o', 'r', 'l', 'd', '!', '@', '#'};
		int uppercs=0,lowercs=0,digit=0,specialch=0;
		//System.out.println(str);
		for(int i=0;i<arr.length;i++)
	{	
			int ch =arr[i];
			
		if(ch>=65 && ch<=90)
		{
			uppercs++;
		}
		else if(ch>=97 && ch<=122)
		{
			lowercs++;
		}
		else if(ch>=48 && ch<=57)
		{
			digit++;
		}
		else if((ch>=32 && ch<=47) || (ch>=58 && ch<=64))
		{
			specialch++;
		}
			
	}
		System.out.println("Uppercase Letters - "+uppercs);
		System.out.println("Lowercase Letters - "+lowercs);
		System.out.println("Digit - "+digit);		
		System.out.println("Special characters - "+specialch);
}
	
	
}
