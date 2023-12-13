package week8;

import java.util.*;
	class PetStore {
	public static void main(String args[]) {
		ArrayList<Pet> pets = new ArrayList<Pet>();
		Scanner scanner = new Scanner(System.in);
		String input;
		String name = "";
		Pet aPet = new Pet();
		String coatColor;
		double weight;
		String featherColor;
		String type;
		String leafColor;
		while (true) {
			System.out.println("OPTIONS: ");
			System.out.println("Cat: 'c'");
			System.out.println("Dog: 'd'");
			System.out.println("Bird: 'b'");
			System.out.println("Plant: 'p'");
			input = scanner.next().toLowerCase();
			if (input.charAt(0) == 'c') {
				System.out.println("Enter the name of the cat (or STOP to quit)");
				name = scanner.next();
				if (name.equalsIgnoreCase("STOP"))
					break;
					System.out.println("Enter the cat's coat color: ");
					coatColor = scanner.next();
					aPet = new Cat();
					((Cat) aPet).setCoatColor(coatColor);
			} 
			else if (input.charAt(0) == 'd') {
			System.out.println("Enter the name of the dog (or STOP to quit):");
			name = scanner.next();
			if (name.equalsIgnoreCase("STOP"))
				break;
				System.out.println("Enter the dog's weight: ");
				weight = scanner.nextDouble();
				aPet = new Dog();
				((Dog) aPet).setWeight(weight);
			}
			
			else if(input.charAt(0) == 'b') {
				System.out.println("Enter the name of the bird (or STOP to quit):");
				name = scanner.next();
				if (name.equalsIgnoreCase("STOP"))
					break;
					System.out.println("Enter the bird's feather color: ");
					featherColor = scanner.next();
					aPet = new Bird();
					((Bird) aPet).setFeatherColor(featherColor);
			}
			
			else if(input.charAt(0) == 'p') {
				System.out.println("Enter the type of plant (or STOP to quit):");
				type = scanner.next();
				if (type.equalsIgnoreCase("STOP"))
					break;
					System.out.println("Enter leaf color: ");
					leafColor = scanner.next();
					aPet = new Plant();
					((Plant) aPet).setLeafColor(leafColor);
			}
		
		else {
				System.out.println("Invalid choice.");
				continue;
		}
		aPet.setName(name);
		pets.add(aPet);
		}
		for (Pet pet : pets) {
			System.out.print(pet.getName() + " is a");
			if (pet instanceof Cat)
				System.out.println(" " + ((Cat)pet).getCoatColor() + "cat.");
			else if (pet instanceof Dog)
				System.out.println(" dog that weights " +
				((Dog)pet).getWeight() + " pounds.");
			else if (pet instanceof Bird) {
				System.out.println(" Bird with" + ((Bird)pet).getFeatherColor() + "-colored feathers.");
			}
			else if (pet instanceof Plant) {
				System.out.println(((Plant)pet).getPlantType() + "with " + ((Plant)pet).getLeafColor() + "-colored leaves.");
			}
		else
		System.out.println("n unknown animal.");
		}
	}
}
