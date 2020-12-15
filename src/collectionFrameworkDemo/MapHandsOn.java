package collectionFrameworkDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapHandsOn {

	Map<Integer, String> map;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapHandsOn demo = new MapHandsOn();
		demo.hashMapMethod();

		System.out.println("--------------------");
		demo.linkedhashmap();

		System.out.println("--------------------");
		demo.treemap();
		
		System.out.println("--------------------");
		demo.iterateMap();
	}

	public void hashMapMethod() {
		map = new HashMap<Integer, String>();
		System.out.println("Hash map");
		map.put(10, "Ten");
		map.put(30, "Thiry");
		map.put(20, "Twenty");
		map.put(20, "20Extra");
		// map.put(k,"null");
		System.out.println("Get value of 10:" + map.get(10));

		Set<Integer> set = map.keySet();

		for (Integer i : set) {
			System.out.println(map.get(i));

		}


	}

	public void linkedhashmap() {
		map = new LinkedHashMap<Integer, String>();
		System.out.println("Linked hash map");
		map.put(10, "Ten");
		map.put(30, "Thiry");
		map.put(20, "Twenty");
		map.put(20, "20Extra");
		// map.put(k,"null");
		System.out.println(map.get(10));

		Set<Integer> set = map.keySet();

		for (Integer i : set) {
			System.out.println(map.get(i));

		}

	}

	public void treemap() {
		map = new TreeMap<Integer, String>();
		System.out.println("Tree map");
		map.put(10, "Ten");
		map.put(30, "Thiry");
		map.put(20, "Twenty");
		map.put(20, "20Extra");
		// map.put(k,"null");
		System.out.println(map.get(10));

		Set<Integer> set = map.keySet();

		for (Integer i : set) {
			System.out.println(map.get(i));

		}

	}
	
	public void iterateMap() {		
		 Map<String,String> gfg = new HashMap<String,String>(); 	      
	        // enter name/url pair 
	        gfg.put("GFG", "geeksforgeeks.org"); 
	        gfg.put("Practice", "practice.geeksforgeeks.org"); 
	        gfg.put("Code", "code.geeksforgeeks.org"); 
	        gfg.put("Quiz", "quiz.geeksforgeeks.org"); 
	          
	        // using for-each loop for iteration over Map.entrySet() 
	        for (Map.Entry<String,String> entry : gfg.entrySet())  
	            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 	    	
	        System.out.println("-------------------->");
	     // using keySet() for iteration over keys 
	        for (String name : gfg.keySet()) 
	            System.out.println("key: " + name); 
	        System.out.println("-------------------->");
	 // using values() for iteration over keys 
    for (String url : gfg.values())  
        System.out.println("value: " + url); 
} 
		
	}


