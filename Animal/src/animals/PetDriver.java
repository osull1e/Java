package animals;

import java.util.ArrayList;

public class PetDriver {

	public static void main(String[] args) {
		PetDriver myDriver = new PetDriver();
		myDriver.run();

	}
	private void run() { // Instance method
		Cat myCat = new Cat("Artemis", 12, "brown", 120.0);
		Cat anotherCat = new Cat("Stinson", 90, "grey", 130.0);
		System.out.println("Hello! My name is " + myCat + "!");
		System.out.println("Hi! My name is " + anotherCat.name + "!");
		System.out.println(anotherCat);
		//System.out.println(this);
		Dog myDog = new Dog("Ruckerford", 12, "tan", 200.0);
		System.out.println(myDog);
		myDog.medium();
		//System.out.println(myCat.makeSound);
		ArrayList<Animal> hospitalPets = new ArrayList<Animal>();
		
		for ( int i = 0; i < 10; i++){
			hospitalPets.add(new Cat("Cat" + i, i + 1, "White", i+10));
			hospitalPets.add(new Dog("Dog" + i, i + 1, "Green", 78.0));
		}
		int i = 0;
		System.out.println("Help!!!");
		for(Animal e: hospitalPets) {
			System.out.println(e);
			// Chaos in the hospital!!
			System.out.println(e.makeSound(i % 3));
			i++;
		}
	}
	
}
