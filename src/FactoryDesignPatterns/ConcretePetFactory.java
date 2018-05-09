package FactoryDesignPatterns;

/**
 * @author Saurabh
 *
 */
public class ConcretePetFactory {
	public static void main(String args[]) { 
		PetFactory pfactory = new PetFactory();
		System.out.println("Hii.");
		Pet pet = pfactory.getPet("Bow");
		System.out.println(pet.petSound());
		
		Pet pet2 = pfactory.getPet("Meow");
		System.out.println(pet2.petSound());
	}
	
}
 