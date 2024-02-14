package Demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap1 {
	
	public static void main(String[] args)
	{
		Map<String,String> m1=new LinkedHashMap<String, String>();
		Map<String,String> m2=new HashMap<String, String>();
		Map<String,String> m3=new TreeMap<String, String>();
		
		m1.put("B3", "Shiva");
		m1.put("B4", "Dev");
		m1.put("B2", "Shree");
		m1.put("B1", "Veer");
		m1.put("B5", "Ani");
		
		System.out.println("Linked HashMap "+m1);
		System.out.println(m1.containsKey("B5"));
		
		m2.put("B1", "Shiva");
		m2.put("B2", "Dev");
		m2.put("B3", "Shree");
		m2.put("B4", "Veer");
		m2.put("B5", null);
		m2.put(null, "Aniket");
		m2.put("B6", null);
	
		System.out.println("HashMap "+m2);
		
		m3.put("B2", "Shiva");
		m3.put("B1", "Dev");
		m3.put("B5", "Shree");
		m3.put("B4", "Veer");
		m3.put("B3", "Ani");
		
		System.out.println("TreeMap "+m3);
		
	}

}
