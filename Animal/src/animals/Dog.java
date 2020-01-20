package animals;

public class Dog extends Animal implements Walker {

	public Dog(String name, int age, String color, double weight) {
		super(name, age, color, weight);
		// TODO Auto-generated constructor stub
	}
	// Sound behavior
		public String makeSound() {
			return "Arrff!";
		}

		public String makeSound(int level) { // 0 = whisper, 1 = normal, 2 = shout
			String result = "";
			switch(level) {
			case 0:
				result = "grrrr..";
				break;
			case 1:
				result = "Arrff!";
				break;
			case 2:
				result = "Arroooooo!!!!";
				break;
			default:
				break;
			}
			return result;
		}
	
}
