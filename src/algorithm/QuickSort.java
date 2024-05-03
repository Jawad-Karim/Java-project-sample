package algorithm;

import java.util.Arrays;
/*
 choose an element as pivot, I choose last element of array.
 compare all other values with pivot and swap greater values to pivot index
 pivot value to left and left value to greater value's index.
 then change pivot index into index.
 */

public class QuickSort {

	static int partition(int[] arr, int leftIndex, int pivotIndex) {

		while(leftIndex<pivotIndex) {
			if(arr[leftIndex]>=arr[pivotIndex]) {
				int temp = arr[leftIndex];
				arr[leftIndex] = arr[pivotIndex-1];
				arr[pivotIndex-1] = arr[pivotIndex];
				arr[pivotIndex] = temp;
				pivotIndex--;				
			}
			else {
				leftIndex++;
			}
		}
		return pivotIndex;
	}

	static void quickSort(int[] arr, int left, int right) {
		int pi = partition(arr, left, right);
		if(left<pi-1) {
			quickSort(arr, left, pi-1);
		}
		if(right>pi+1) {
			quickSort(arr, pi+1, right);
		}		
	}

	public static void main(String[] args) {
		int[] arr = {32, 21, 31, 34, 23, 6, 4, 24, 46, 2, 76, 7, 0, 1};
		quickSort(arr, 0, arr.length-1);
		System.out.println("sorted arry: "+Arrays.toString(arr));
	}
}
