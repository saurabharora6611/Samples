package FactoryDesignPatterns;

public class PetFactory {

	public Pet getPet(String petType) {
		Pet pet = null;
		
		if(petType.equalsIgnoreCase("Bow"))
		 pet = new Dog();
		else if(petType.equalsIgnoreCase("Meow"))
		 pet = new Cat();
		
		return pet;
	}
}
