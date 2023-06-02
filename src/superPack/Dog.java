package superPack;

public class Dog {
	
	public static void main(String[] args) {
		
		String color = "Black White";
		String[] colors = color.split(" ");
		String black = colors[0];
		String white = colors[1];
		
		System.out.println("black : "+black+""+"\n  white : "+white);
		
		B b = new B();
		b.sound();
		
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		
		a1.x = 25;
		
		System.out.println("x : "+a1.x +"\n"+ "x : "+a2.x);
		
		test();
		
		
	}
	
	public static void test() {
		
		System.out.println("this is public static method");
	}

}
