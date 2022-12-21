package Lec26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("India", 1000);
		map.put("USA", 200);
		map.put("Russia", 100);
		map.put("Argentina", 100);
		
		System.out.println(map);
		map.put("India", 2000);
		System.out.println(map);
		
		
		System.out.println(map.get("India"));
		
		map.remove("Argentina");
		System.out.println(map);
		System.out.println(map.containsKey("india"));
		
		
		Set<String> ks =  map.keySet();
		for(String key:ks)
		{
			System.out.println(key+" "+map.get(key));
		}
		
		System.out.println("---------------------------");
		
		for(String key:map.keySet())
		{
			System.out.println(key+" "+map.get(key));
		}
		
		System.out.println("------------------------------");
		
		ArrayList<String> al = new ArrayList<>(map.keySet());
		for(String key:al)
		{
			System.out.println(key+" "+map.get(key));
		}

	}

}
