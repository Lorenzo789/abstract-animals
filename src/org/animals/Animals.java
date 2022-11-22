package org.animals;

public abstract class Animals {

	private String name;
	private String category;
	
	public Animals(String name, String category) {
		
		setName(name);
		setCategory(category);
		
	}

	public abstract void animalCall();
	
	public abstract void whatEat();
	
	public String Sleep() {
		return "zzzzzzzz";
	}
	
	//setter and getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	//setter and getter

	@Override
	public String toString() {
		return "Category: " + getCategory()
		+ "\nName: " + getName();
	}
	
	
}
