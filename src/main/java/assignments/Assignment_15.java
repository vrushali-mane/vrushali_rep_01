package assignments;


public class Assignment_15 {
	/*
	 *Given an array of strings, sort the strings in ascending order of their lengths.
	 *Input :Java,Python,JavaScript,Ruby,C,Selenium
	 *Output:C,Java,Ruby,Python,Selenium,JavaScript
	 */
	public static void main(String args[])
	{
		String in="Java,Python,JavaScript,Ruby,C,Selenium";
		String temp = null;
		
		String arr[]=in.split(",");
		
		for(int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i].length()>arr[j].length())
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;				
				}
				else if(arr[i].length()== arr[j].length() && arr[i].charAt(0) > arr[j].charAt(0))
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;							
				}
			}
		System.out.print(arr[i]+" ");
	
		}
		
	}
	
	
}
