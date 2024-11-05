package com.collectiondemo.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapMain {

	public static void main(String[] args) {

		Map<Integer, String> hmap = new HashMap<>();
		hmap.put(1233, "XYZ");
		hmap.put(1237, "ABC");
		hmap.put(1235, "DEF");
		hmap.put(1234, "LMN");
		hmap.put(1236, "TUV");
		hmap.put(1238, "SUV");
		hmap.put(1233, "PQR");
		
		System.out.println("All entries from hmap are :- ");
		Set<Entry<Integer, String>> eset = hmap.entrySet();
		
		for(Entry<Integer, String> e : eset) {
			System.out.println(e.getKey() + " : " + 
									e.getValue());
		}
		
		System.out.println("All keys from hmap are :- ");
		Set<Integer> kset = hmap.keySet();
		kset.forEach(System.out::println);
		
		System.out.println("Value associated with key 1235"
				+ " : " + hmap.get(1235));
		
		System.out.println("is key 1240 present in hmap : "
				+ hmap.containsKey(1240));
		
		System.out.println("is value SUV present in hmap : "
				+ hmap.containsValue("SUV"));
		
		hmap.remove(1234);
		hmap.remove(1233,"Amit");
		
		System.out.println("After removal , all entries"
				+ " from hmap are :- ");
		eset = hmap.entrySet();
		
		for(Entry<Integer, String> e : eset) {
			System.out.println(e.getKey() + " : " + 
									e.getValue());
		}
	}
}








