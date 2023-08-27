package algorithm;

public class Binary_search {


	public static void searchItem(int search_item) {

		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

		int firstIndex = 0;
		int lastIndex = arr.length-1;
		int middle;

		for(int i=firstIndex; i<lastIndex; i++) {
			middle = (firstIndex+lastIndex)/2;
			if(search_item == arr[middle]) {
				System.out.println("search item "+arr[middle]+" found at index "+middle);
				break;
			}
			else if(search_item > arr[middle]) {
				firstIndex = middle;
			}
			else {
				lastIndex = middle;
			}
		}
	}

	public static void main(String[] args) {
		searchItem(40);

	}
}
