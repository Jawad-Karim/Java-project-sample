package map;

import java.util.HashMap;

public class Hash_map {
	/*
	 Hashmap stores elements as key-value pairs.
	 key can be null only one time, value can be null multiple time
	 key can not be duplicate value can be duplicate but not in TreeMap.
	 does not maintain insertion order.
	 */

	public static void main(String[] args) {

		// Create a HashMap object called capitalCities
		HashMap<String, String> capitalCities = new HashMap<String, String>();

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
