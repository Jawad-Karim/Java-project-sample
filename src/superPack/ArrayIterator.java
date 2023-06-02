package superPack;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator {

	public static void main(String[] args) {
		
		ArrayList <String> cars = new ArrayList <String>();
		cars.add("toyota");
		cars.add("honda");
		cars.add("nissan");
		cars.add("bmw");
		cars.add("saturn");
		
		System.out.println(cars);
		
		Iterator <String> itr = cars.iterator();
		System.out.println(itr.next()+"\n");
		
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		int number = 6;
		for(int i=0; i<=10; i++) {
			if(i==number) {
				continue;
			}
			
			System.out.println(i);
			
			
			
		}
		

	}

}
