package java_code_challenges;
import java.util.Arrays;

public class CheckEqualityOfTwoArrays {

	public static void main(String[] args) {
//Approach 1
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,4,4,5};		
		boolean status1 = Arrays.equals(a, b);
		if(status1 == true) {
			System.out.println("arrays are equal");
		}
		else {
			System.out.println("arrays are not equal");
		}		
//Approach2
		boolean status2 = true;
		if(a.length == b.length) {
			for(int i=0; i<a.length; i++) {
				if(a[i]==b[i]) {
					status2 = true;
				}
				else {
					status2 = false;
					break;
				}
			}
		}
		if(status2 == true) {
			System.out.println("arrays are equal");
		}
		else {
			System.out.println("arrays are not equal");
		}
	}
}
