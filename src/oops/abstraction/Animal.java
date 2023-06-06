package oops.abstraction;

public abstract class Animal {

	// static final variable
	public static final int x = 10;

	//non static non final variable
	int y = 20;

	//Abstract method
	public abstract void eat();

	//non abstract method
	public void food() {
		System.out.println("food method");
	}

}
