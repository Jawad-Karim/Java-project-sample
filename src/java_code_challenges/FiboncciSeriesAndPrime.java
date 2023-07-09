package java_code_challenges;

public class FiboncciSeriesAndPrime {

	public static void main(String[] args) {

//FibonacciSeries number is a number-series where each number is a sum of two preceding numbers.
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		System.out.print(n1+" "+n2);
		for(int i=2; i<10; i++) {
			sum = n1+n2;
			System.out.print(" "+sum); 
			n1 = n2;
			n2 = sum;
			//outcome: 0 1 1 2 3 5 8 13 21 34
		}
		System.out.println();

//Prime number is greater than 1 and that has two factors only 1 and itself.
		int n = 11;
		int count = 0;
		if(n>1) {
			for(int i=1; i<=n; i++) {
				if(n%i == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(n+" is a Prime number");
			}
			else {
				System.out.println(n+" is not a Prime number");
			}
		}
		else {
			System.out.println(n+" is not a Prime number");
		}
	}
}
