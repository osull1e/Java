package animals;

public class Cat extends Animal {
	
	public Cat(String name, int age, String color, double weight) {
		super(name, age, color, weight);
	}
	
	public String makeSound(){
		return "Purr";
	}

}
