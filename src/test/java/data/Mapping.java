package data;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapping {
 static 	Map<String, Integer> m = new HashMap<String, Integer>();
	
	public static void main(String[] args) {
		
		
		m.put("jayant",80 );
		m.put("anushka", 80);
		m.put("amit", 75);
		m.put("abhishek", 90);
		m.put("danish", 40);
		
		
		Map<String, Integer> m1 = new TreeMap<String, Integer>();
		
		
		m1.putAll(m);
		
		System.out.println(m1);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
