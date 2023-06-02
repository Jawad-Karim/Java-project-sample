package polimorphism;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		A a = new A();
		a = new B();
		a = new C();
		System.out.println("string main method");

		int[] x = {10, 20, 30, 40};

	}
}
