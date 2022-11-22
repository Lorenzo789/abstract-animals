package org.azienda.italy;

import java.time.LocalDate;

public class Employee extends Person {

	private int salary;
	private int monthlyCount;
	
	public Employee(String name, String surname, LocalDate dateOfBirth, int salary, int monthlyCount) {
		super(name, surname, dateOfBirth);
		setSalary(salary);
		setMonthlyCount(monthlyCount);
	}

	// setters and getters
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getMonthlyCount() {
		return monthlyCount;
	}

	public void setMonthlyCount(int monthlyCount) {
		this.monthlyCount = monthlyCount;
	}
	// setters and getters
	
	@Override
	public String toString() {
		return "Name: " + getName()
		+ "\nSurname: " + getSurname()
		+ "\nDate Of Birth: " + getDateOfBirth()
		+ "\nSalary: " + getSalary()
		+ "\nFull name and code: " + getFullName()
		+ "\nCount of Month: " + getMonthlyCount()
		+ "\nYear Income: " + getYearIncome();
	}

	@Override
	public int getYearIncome() {
		return salary * monthlyCount;
	}
}
