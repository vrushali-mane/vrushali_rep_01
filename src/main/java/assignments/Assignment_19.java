package assignments;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Assignment_19 {
	
	/*
	 * Resolve UnsupportedOperationException exception
	 */
	
	public static void main(String args[])
	{
	
		List<String> l1=Arrays.asList("TN","MP","MH");
	
		System.out.println(l1);
		//l1.add("DL");
		
		List<String> newlist=new ArrayList<String>(l1);
		newlist.add("DL");
		System.out.println("New list"+newlist);

		
	}
	
	
}
