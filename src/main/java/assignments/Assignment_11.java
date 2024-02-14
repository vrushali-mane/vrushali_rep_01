package assignments;

import java.util.Scanner;

public class Assignment_11 {
	/*
	 *Write a Java program that takes an integer array as input and find the duplicates in the array.
	 *Input : a[] = { 2,3,4,5,2,4,5,7,8}
	 *Output : 2,4,5
	 */
	public static void main(String args[])
	{
		int num,count = 0,k;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size");
		num=sc.nextInt();
		
		int[] arr=new int[num];
		
		System.out.println("Enter array element");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array elements are - ");
		for(int i=0;i<num;i++)
		{
			System.out.print(arr[i]+" ");
			//System.out.println();
		}
		System.out.println();
		System.out.println("Repeated no. are - ");
		for(k=0;k<num;k++)
		{
			count=0;
			for(int j=k+1;j<num;j++)
			{
				if(arr[k]==arr[j])
				{
					count++;
					//System.out.println(arr[i]+" ");
				}
				
			}
			if(count==1)
			{
				System.out.println(arr[k]+" ");
			}
			
		}
		
		sc.close();
		
	
}
	
	
}
