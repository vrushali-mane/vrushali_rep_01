package assignments;

import java.util.ArrayList;

public class ArrayListClass_2 {

	public static void main(String[] args) {
	ArrayList<String> list1=new ArrayList<String>();
	ArrayList<String> list2=new ArrayList<String>();
	ArrayList<String> list3=new ArrayList<String>();
	
	list1.add("Ashwini");
	list1.add("Anu");
	list1.add("Anirudha");
	list1.add("Neha");
	list1.add("Shweta");
	list1.add("Vrushali");
	list1.add("Shiva");
	

	for(int i=0;i<list1.size();i++)
	{
		String str=list1.get(i);
		
				if(str.startsWith("A")||str.startsWith("N"))
				{
					list2.add(str);
				}
				else
				{
					list3.add(str);
				}
	}
	
	System.out.println("List 1 - "+list2);
	System.out.println("List 2 - "+list3);
	}

}
