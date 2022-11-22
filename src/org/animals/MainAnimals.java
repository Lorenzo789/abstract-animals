package org.animals;

public class MainAnimals {
	
	/*
		Todo
		Dobbiamo realizzare un programma che rappresenti il regno animale.
		Creiamo quindi una classe astratta Animale e delle classi che la estendono : Cane, Passerotto, Aquila, Delfino
		Vogliamo che gli animali abbiano i seguenti metodi
	
	    void dormi(): mostra a video “Zzz”
	    void verso(): mostra a video il verso fatto dall'animale specifico
	    void mangia(): mostra a video quello che mangia : erba, carne, ...?
	
		Quali di questi metodi devono essere implementati nella classe astratta
		e quali devono essere lasciati astratti e implementati dalle classi che la estendono?
		Una volta create le classi, nel programma istanziare alcuni animali e utilizzare i metodi implementati nel main.
		
		Alcuni degli animali che abbiamo creato volano, altri nuotano. Definire e implementare un interfaccia che esponga i seguenti metodi:
		
		IVolante
	    void vola(): mostra a video “Sto volando!!!”
	
		INuotante
	    void nuota(): mostra a video “Sto nuotando!!!”
	
		Scrivere un programma avente oltre al main 2 metodi statici:

	    static void faiVolare(IVolante animale)
	    static void faiNuotare(INuotante animale)
	
		Questi metodi prendono come parametro un animale che può o volare / nuotare e richiamano il corrispondente metodo vola()/nuota().
		Scrivere un programma che istanzi animali che volano o nuotano e richiamare i metodi faiVolare()/faiNuotare() passandoglieli come parametro.
	 */
	
	public static void main(String[] args) {
		
		Dog a = new Dog("Fulvio", "Cane");
		System.out.println(a);
		System.out.println(a.Sleep());
		a.animalCall();
		a.whatEat();
		System.out.println("|------------------------------------|");
		
		Dolphin b = new Dolphin("Carlo", "Delfino");
		System.out.println(b);
		System.out.println(b.Sleep());
		b.animalCall();
		b.whatEat();
		System.out.println("|------------------------------------|");
		
		Sparrow c = new Sparrow("Gianni", "Passerotto");
		System.out.println(c);
		System.out.println(c.Sleep());
		c.animalCall();
		c.whatEat();
		System.out.println("|------------------------------------|");
		
		Eagle d = new Eagle("Costanza", "Acquila");
		System.out.println(d);
		System.out.println(d.Sleep());
		d.animalCall();
		d.whatEat();
		System.out.println("|------------------------------------|");
		
		makeItSwim(b);
		makeItFly(c);

	}
	
	public static void makeItFly(IFlying animal) {
		animal.fly();
	}
	
	public static void makeItSwim(iSwimming animal) {
		animal.swim();
	}
}
