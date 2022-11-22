package org.animals;

public class Eagle extends Animals implements IFlying {

	public Eagle(String name, String category) {
		super(name, category);

	}
	
	@Override
	public void animalCall() {
		
		System.out.println("SCREECH");
	}

	@Override
	public void whatEat() {

		System.out.println("small mammals, birds");
	}
	
	@Override
	public void fly() {
		System.out.println("Im Flying!!!");
		
	}
	
	@Override
	public String toString() {

		return super.toString();
	}
}
