package assignments;

import java.util.ArrayList;

public class ArrayListClass_1 {

	public static void main(String[] args) {
	ArrayList<String> list1=new ArrayList<String>();
	
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
					System.out.println(str);
				}
	}
	
	}

}
