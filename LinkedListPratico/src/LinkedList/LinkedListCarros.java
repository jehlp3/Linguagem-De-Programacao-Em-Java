package LinkedList;

import java.util.LinkedList;

public class LinkedListCarros {
	public static void main(String[] args) {
		
		/* addFirst()
		 * addLast()
		 * removeFirst()
		 * removeLast()
		 * getFirst()
		 * getLast()
		 * */
		
		String carro;
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		System.out.println(cars);
		
		cars.addFirst("Mazda");
		System.out.println(cars);
		
		cars.addLast("Bugatti");
		System.out.println(cars);
		
		carro = cars.get(3); //3ª posição, 0 1 2 3.
		System.out.println(carro);
		
		cars.removeFirst();
		System.out.println(cars);
		
		System.out.println(cars.getFirst());
		System.out.println(cars);
		
		cars.clear();
		if (cars.isEmpty()) {
			System.out.println("LinkedList vazio");
		}
	}
}
