
public class Zoo {

	public static void main(String[] args) {
		Animal newAnimal = new Animal(2,1,4,"Steve","Rainbow");
		System.out.println(newAnimal);
		
		newAnimal.setNumHeads(10);
		System.out.println(newAnimal.getNumHeads());

	}

}
