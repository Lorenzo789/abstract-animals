package org.azienda.italy;

import java.time.LocalDate;

public abstract class Person {

	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private String companyCode;
	
	public Person(String name, String surname, LocalDate dateOfBirth){
		
		setName(name);
		setSurname(surname);
		setDateOfBirth(dateOfBirth);

		companyCode = "12345";
	}
	
	public abstract int getYearIncome();
	
	public String getFullName() {
		return getName() + getSurname() + getCompanyCode();
	}

	// setter and getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCompanyCode() {
		return companyCode;
	}
	// setter and getter

	@Override
	public String toString() {
		return "Name: " + getName()
		+ "\nSurname: " + getSurname()
		+ "\nDate Of Birth: " + getDateOfBirth()
		+ "\nCompany Code: " + getCompanyCode()
		+ "\nFull name and code: " + getFullName();
	}
}
