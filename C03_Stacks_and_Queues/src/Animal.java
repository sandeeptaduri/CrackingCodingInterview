
public class Animal {

	private String name;
	AnimalType type;

	public Animal(AnimalType type, String name) {
		this.type = type;
		this.name = name;
	}

	public String getType() {
		return type.toString();
	}

	public String getName() {
		return name;
	}

}
