
public class Animal {
	private int numEyes;
	private int numHeads;
	private int numLegs;
	private String nameAnimal;
	private String color;
	
	public Animal (int eyes, int heads, int legs, String name, String colors) {
		setNumEyes(eyes);
		setNumHeads(heads);
		setNumLegs(legs);
		setName(name);
		setColor(colors);
		
	}
	public void setNumEyes(int eyes) {
		if (eyes >= 0) {
			numEyes = eyes;
		}
		else {
			numEyes = 4;
			System.out.println("Eyes cannot be negative, defaulting to 2");
		}
	}
	public void setNumHeads(int heads) {
		if (heads >= 0) {
			numHeads = heads;
		}
		else {
			numHeads = 4;
			System.out.println("Heads cannot be negative, defaulting to 1");
		}
	}
	public void setNumLegs(int legs) {
		if (legs >= 0) {
			numLegs = legs;
		}
		else {
			numLegs = 4;
			System.out.println("Legs cannot be negative, defaulting to 4");
		}
	}
	public void setName(String name) {
		if (name.equals(" ")) {
			nameAnimal = "Steve";
			System.out.println("Animals cannot have no name, defaulting to 'Steve'");
		}
		else {
			nameAnimal = name;
	
		}
	}
	public void setColor(String colors) {
		if (colors.equals(" ")) {
			color = "Rainbow";
			System.out.println("An animal cannot not have color, defaulting to 'Rainbow'");
		}
		else {
			color = colors;
		}
	}
	public int getNumEyes() {
		return numEyes;
	}
	public int getNumHeads() {
		return numHeads;
	}
	public int getNumLegs() {
		return numLegs;
	}
	public String getName() {
		return nameAnimal;
	}
	public String getColor() {
		return color;
	}
	public String toString() {
		return "This animal is a "+color+" colored "+nameAnimal+" with "+numEyes+" eyes, "+numHeads+" heads, "
				+ " and "+numLegs+" legs.";
	}

}
