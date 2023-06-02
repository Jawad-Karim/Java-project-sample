package demo;

import java.util.Scanner;

public class Java_test {
	
	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		//int n = scan.nextInt();
		
		
		function();
		
		//scan.close();
		
		
	}
	
	public static void function() {
		
		int n;
		  //char s1, s2, s3;
		  Scanner in = new Scanner(System.in);
		  System.out.print("Input number: ");
		  n = in .nextInt();
		  System.out.printf("%d%d / %d", n,n,n);
	}
}

