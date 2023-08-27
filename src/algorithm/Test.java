package algorithm;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		int[] arr = {40, 30, 80, 20, 70, 90, 60, 10, 50, 100};
		//int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length-1; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
