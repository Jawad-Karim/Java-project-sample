package java_code_challenges;

import java.util.HashSet;

public class Find_common_elements_in_2_Arrays {

	public static void main(String[] args) {

		// Write a Java program to find common elements between two arrays (string values).

		String[] array3 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
		String[] array4 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < array3.length; i++){
			for (int j = 0; j < array4.length; j++){
				if(array3[i].equals(array4[j])){
					set.add(array3[i]);
				}
			}
		}
		System.out.println("Common element : "+(set));
	}
}
