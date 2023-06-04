package java_code_challenges;

public class Find_duplicate_value_in_Array {

	public static void main(String[] args) {

		// Write a Java program to find duplicate values in an array of integer values.

		int[] my_array2 = {1, 2, 5, 5, 6, 6, 7, 2};

		for (int i = 0; i < my_array2.length-1; i++){
			for (int j = i+1; j < my_array2.length; j++){
				if ((my_array2[i] == my_array2[j])){
					System.out.println("Duplicate Element : "+my_array2[j]);
				}
			}
		}
	}
}
