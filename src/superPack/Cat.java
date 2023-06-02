package superPack;

public class Cat extends Animal {
	
	public Cat() {
		
		//super.sound();
		System.out.println("cat constructor");
	}
	

	public void sound () {
		
		System.out.println("cat does mew mew");
	}
	
	public void work() {
		super.sound();
		sound();
	}
	
	public static void main(String[] args) {
		
		new Cat().work();
	}

}
