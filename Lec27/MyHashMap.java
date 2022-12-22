package Lec27;

import java.util.ArrayList;

public class MyHashMap <K,V> {
	
	private class Node{
		K key;
		V value;
		Node next;
		
		Node(K key,V val)
		{
			this.key = key;
			this.value = val;
			next = null;
		}
	}
	
	private ArrayList<Node> map;
	int size = 0;
	int th = 2;
	
	public MyHashMap()
	{
		this(5);
	}
	public MyHashMap(int size) {
		
		map = new ArrayList<>();
		for(int i = 0; i < size; i++)
			map.add(null);
	}
	
	private int hashFn(K key)
	{
		int hv = key.hashCode()%map.size();
		if(hv < 0)
			hv += map.size();
		
		return hv;
	}
	
	public void put(K key, V val)
	{
		int hv = hashFn(key);
		
		Node temp = map.get(hv);
		while(temp != null)
		{
			if(temp.key.equals(key))
			{
				temp.value = val;
				return;
			}
			temp = temp.next;
		}
		
		Node n = new Node(key,val);
		n.next = map.get(hv);
		map.set(hv, n);
		
		size++;
		
		if(size/map.size() > 2)
		{
			rehash();
		}
	}
	
	private void rehash()
	{
		ArrayList<Node> nb = new ArrayList<Node>();
		ArrayList<Node> ob = map;
		for(int i = 0; i < 2*ob.size();i++)
			nb.add(null);
		map = nb;
		for(int i = 0; i < ob.size(); i++)
		{
			Node temp = ob.get(i);
			while(temp != null)
			{
				put(temp.key,temp.value);
				temp = temp.next;
			}
		}
	}
	
	public V get(K key)
	{
		int hv = hashFn(key);
		Node temp = map.get(hv);
		while(temp != null)
		{
			if(temp.key.equals(key))
			{
				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}
	
	public void remove(K key)
	{
		int hv = hashFn(key);
		Node temp = map.get(hv);
		Node prev = null;
		while(temp != null)
		{
			if(temp.key.equals(key))
			{
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		if(temp == null)
			return;
		if(prev == null)
		{
			map.set(hv,map.get(hv).next);
		}
		else
		{
			prev.next = temp.next;
		}
		
		size--;
	}
	
	public void display() {
		String st = "{ ";
		for(int i = 0; i < map.size(); i++)
		{
			Node temp = map.get(i);
			while(temp != null)
			{
				st += temp.key+" : "+temp.value+" , ";
				temp = temp.next;
			}
		}
		st += " }";
		
		System.out.println(st);
	}
	@Override
	public String toString()
	{
		String st = "{ ";
		for(int i = 0; i < map.size(); i++)
		{
			Node temp = map.get(i);
			while(temp != null)
			{
				st += temp.key+" : "+temp.value+" , ";
				temp = temp.next;
			}
		}
		st += " }";
		
		return st;
	}

}
