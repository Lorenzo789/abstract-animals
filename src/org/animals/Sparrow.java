package org.animals;

public class Sparrow extends Animals implements IFlying {

	public Sparrow(String name, String category) {
		super(name, category);

	}
	
	
	@Override
	public void animalCall() {
		
		System.out.println("CIP CIP");
	}

	@Override
	public void whatEat() {

		System.out.println("bird food, seeds, fruits");
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
