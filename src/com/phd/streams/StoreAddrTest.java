package com.phd.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StoreAddrTest {
	public static void main(String[] args) {

		StoreAddress storeAddress1 = new StoreAddress("1500 Kothapet Hyd", null, null, "TG", "OH", "43240", "IN",
				"9912399123");
		StoreAddress storeAddress2 = new StoreAddress("160 Gachibowli Hyd", null, null, "TG", "OH", "43240", "IN",
				"9912399123");

		List<Store> storeList = new ArrayList<Store>();
		storeList.add(new Store(1, "Spar", 7, new ArrayList<String>(Arrays.asList("500081", "500032", "500027")),
				storeAddress1));
		storeList.add(new Store(2, "DMart", 7, new ArrayList<String>(Arrays.asList("500084", "500087", "500012")),
				storeAddress2));

		Map<String, List<Store>> zipCodeStoreMap = new HashMap<String, List<Store>>();

		String key = "500081";// See if a Store associates with this zip code.
		// Add the key and the results from filtering the storeList based on the key.
		zipCodeStoreMap.put(key,
				storeList.stream().filter(x -> x.getServingZipCodes().contains(key)).collect(Collectors.toList()));
		
		// Print results in J7
		for (Map.Entry<String, List<Store>> entry : zipCodeStoreMap.entrySet()) {
			for (Store store : entry.getValue()) {
				System.out.println("filter 1: " + entry.getKey() + " - " + store.getStoreName());
			}
		}

		// print values in J7+J8
		
		for (Map.Entry<String, List<Store>> store : zipCodeStoreMap.entrySet()) {
			
			zipCodeStoreMap.entrySet().forEach(entry -> {
			    System.out.println("Key : " + entry.getKey() + " Obj +: " + store.getValue());
			}); 
		
		}
		
		// print values in J8
		
		
		zipCodeStoreMap.entrySet().forEach(entry -> {
		    System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue().size());
		});
		
		zipCodeStoreMap
				.entrySet()
				.stream()
				.filter(entry -> entry.getKey().equals(key));

	}

}
