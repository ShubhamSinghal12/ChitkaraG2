package Lec27;

import java.util.HashMap;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashMap<String, Integer> map = new MyHashMap<>();
		
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
		
//		System.out.println(map.containsKey("india"));

	}

}
