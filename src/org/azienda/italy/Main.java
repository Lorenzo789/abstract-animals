package org.azienda.italy;

import java.time.LocalDate;

public class Main {

	/*
	*Repo
	
	-- nessuna --
	Package
	
	-ragionevole-
	Todo
	
	Definire le seguenti classi:
	Person
	
	Classe astratta con i seguenti attributi:
    name : String
    surname : String
    date of birth : LocalDate
    codice aziendale : String : valore casuale di 5 cifre
	
	Definire:
    costruttore che prende in ingresso tutti i dati (codice aziendale calcolato casualmente)
    proprieta' getter/setter
    toString (sensato)
	
	Definire come metodo concreto:
	public String getFullName() // restituisce "nome cognome (codice aziendale)"

	Definire inoltre come metodo astratto:
	public int getYearIncome();
	
	Employee
	Classe concreta che esetende la classe Person, aggiungendo i seguenti attributi:
    salary : int
    monthlyCount : int
	
	Definire:
    costruttore
    proprieta' getter/setter
    toString (sensato, sfruttando il toString di Person)
	Definisce come incasso annuale: salary * monthlyCount
	
	Boss
	Classe concreta che esetende la classe Person, aggiungendo i seguenti attributi:
    salary : int
    bonsu: int
    
	Definire:
	
    costruttore
    proprieta' getter/setter
    toString (sensato, sfruttando il toString di Person)
	Definisce come incasso annuale: salary * 12 + bonus
	
	Main
	All'interno del main definire un array di 5 elementi di cui 3 Employee e 2 Boss e ricavare i seguenti elementi (di tipo Person):
    la persona con incasso annuale massimo
    la persona con incasso annuale minimo
	
	Ricavare inoltre le seguenti informazioni:
    trovare il costo annuale dell'intera azienda
    trovare il costo medio per ogni dipendente (Boss compresi)
	
	Bonus
    Trovare il Boss con l'incasso annuale maggiore
    Trovare l'Employee con l'incasso annuale minore

	 */
	
	
	public static void main(String[] args) {
		
		Employee a = new Employee("Robert", "Tizian", LocalDate.now(), 1300, 12);
		Employee b = new Employee("Roberto", "Marconi", LocalDate.now(), 1100, 12);
		Employee c = new Employee("Rob", "Stark", LocalDate.now(), 1000, 12);
		
		Boss d = new Boss("Tyrion", "Lannister", LocalDate.now(), 6000, 2500);
		Boss e = new Boss("Jon", "Snow", LocalDate.now(), 3500, 5000);
		
		Person[] pers = {a, b, c, d, e};
		
		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		Person maxEmploIncome = null;
		Person minEmploIncome = null;
		int totalIncomeSum = 0;
		int avgCompanyCost = 0;
		
		for(int x = 0; x < pers.length; x++) {
			
			Person p = pers[x];
			int yearIncome = p.getYearIncome();
			
			if(maxValue < yearIncome) {
				maxValue = yearIncome;
				maxEmploIncome = p;
			}
			
			if(minValue > yearIncome) {
				minValue = yearIncome;
				minEmploIncome = p;
			}
			
			totalIncomeSum += yearIncome;
		}
		System.out.println(maxEmploIncome);
		System.out.println("|----------------------------|");
		System.out.println(minEmploIncome);
		System.out.println("|----------------------------|");
		System.out.println("Total Spend for the company");
		System.out.println(totalIncomeSum);
		System.out.println("|----------------------------|");
	}
	
}
