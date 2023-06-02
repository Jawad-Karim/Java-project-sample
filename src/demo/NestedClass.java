package demo;

public class NestedClass {
	
	public void life() {
		
		animal();
	}
	
	public static void animal() {
		cow();
		horse();
		
	}
	
	private static void cow() {
		
		System.out.println("this is cow method");
	}
	
	private static void horse() {
		
		System.out.println("this is a horse method");
	}

	public static void main(String[] args) {
		
		//animal();

		NestedClass nc = new NestedClass();
		nc.life();
	}

}
