package assignments;


public class Assignment_14 {
	/*
	 *Write a Java program that takes a sentence as input and counts the number of words in it.
	 *Input :
	 *String str = "Hello,World.";
	 *Output :
	 *Number of words = 2
	 */
	public static void main(String args[])
	{
		String str="Hello,World.Vrushali.Here!";
		String arr[]=str.split("[,.!]");
		int count=0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			
			if((arr[i].charAt(0)>='A' ||arr[i].charAt(0)>='a') && (arr[i].charAt(0)<='Z' || arr[i].charAt(0)<='z'))
			{
			count++;
			}
		}
		
		System.out.println("Number of words - "+count);
	}
		
	
	
}
