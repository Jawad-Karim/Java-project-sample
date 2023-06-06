package map;

import java.util.TreeMap;

public class Tree_map {
	/*
	 TreeMap stores elements as key-value pairs as sorted in ascending order.
	 null and duplicates are not allowed.
	 */

	public static void main(String[] args) {

		// Create a LinkedHashMap object called capitalCities
		TreeMap<String, String> capitalCities = new TreeMap<String, String>();

		// Add keys and values (Country, City)
		capitalCities.put("Bangladesh", "dhaka");
		capitalCities.put("Finland", "Helsinki");
		capitalCities.put("Australia", "Sidney");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);

		//access an element
		capitalCities.get("Finland");

		//print all keys
		for (String i : capitalCities.keySet()) {
			System.out.println(i);
		}

		//print all values
		for (String i : capitalCities.values()) {
			System.out.println(i);
		}

		// Print keys and values
		for (String i : capitalCities.keySet()) {
			System.out.println("key: " + i + "      value: " + capitalCities.get(i));
		}
	}
}
