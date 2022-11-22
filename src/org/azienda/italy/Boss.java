package org.azienda.italy;

import java.time.LocalDate;

public class Boss extends Person {

	private int salary;
		private int bonus;
	
	public Boss(String name, String surname, LocalDate dateOfBirth, int salary, int bonus) {
		super(name, surname, dateOfBirth);
		setBonus(bonus);
		setSalary(salary);
	}

	// setters and getters
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	// setters and getters
	
	@Override
	public int getYearIncome() {
		return salary * 12 + bonus;
	}

	@Override
	public String toString() {
		return "Name: " + getName()
		+ "\nSurname: " + getSurname()
		+ "\nDate Of Birth: " + getDateOfBirth()
		+ "\nSalary: " + getSalary()
		+ "\nFull name and code: " + getFullName()
		+ "\nYear Income: " + getYearIncome();
	}
	
	
}
