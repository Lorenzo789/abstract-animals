package org.animals;

public class Dolphin extends Animals implements iSwimming {

	public Dolphin(String name, String category) {
		super(name, category);

	}
	
	@Override
	public void animalCall() {
		
		System.out.println("SONAR WAVES");
	}

	@Override
	public void whatEat() {

		System.out.println("fish, shellfish, squid");
	}
	
	@Override
	public void swim() {
		System.out.println("Im Swimming!!!");
		
	}
	
	@Override
	public String toString() {

		return super.toString();
	}
}
