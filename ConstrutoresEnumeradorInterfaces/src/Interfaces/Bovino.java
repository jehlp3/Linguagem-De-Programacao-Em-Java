package Interfaces;

public class Bovino implements Animal {  //implements - implementa os métodos da interface

	@Override
	public void animalSom() {
		System.out.println("Muuuu");
	}

	@Override
	public void animalComer() {
		System.out.println("Comendo capim");	
	}

	@Override
	public void animalAbrigo() {
		// TODO Auto-generated method stub
		
	}
}