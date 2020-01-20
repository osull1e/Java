package animals;

public class Animal {
	// Data attributes (members)
		protected String name;
		protected int age;
		protected String color;
		protected double weight;
		
		public Animal(String name, int age, String color, double weight) {
			super();
			this.name = name;
			this.age = age;
			this.color = color;
			this.weight = weight;
		}
		
		public String toString() {
			String result;
			result = "Name: " + name + ", age: " + age + ","
					+ "weight: " + weight + ", color: " + color;
			
			return result;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}
		
		public String makeSound(int level) { // 0 = whisper, 1 = normal, 2 = shout
			String result = "";
			switch(level) {
			case 0:
				result = "hhhaaa";
				break;
			case 1:
				result = "Hhaaaa";
				break;
			case 2:
				result = "HHHAAAAAAAA";
				break;
			default:
				break;
			}
			return result;
		}
}
