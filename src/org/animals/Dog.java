package org.animals;

public class Dog extends Animals {

	public Dog(String name, String category) {
		super(name, category);
		
	}

	@Override
	public void animalCall() {
		
		System.out.println("BAU BAU");
	}

	@Override
	public void whatEat() {

		System.out.println("croquettes, dog food, all");
	}
	
	@Override
	public String toString() {

 		return super.toString();
	}
}
