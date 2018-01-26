package virtual_pet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPet pet = new VirtualPet();

		do {
			System.out.println(pet.displayStatus());

			System.out.println();
			System.out.println("What do you want to do?");
			System.out.println("1. Feed " + pet.getName());
			System.out.println("2. Water " + pet.getName());
			System.out.println("3. Play with " + pet.getName());
			System.out.println("4. Give " + pet.getName() + " a nap");
			System.out.println("5. Do nothing");

			int userInput = input.nextInt();
			switch (userInput) {
			case 1: {
				pet.feedPet();
				break;
			}
			case 2: {
				pet.waterPet();
				break;
			}
			case 3: {
				pet.playWithPet();
				break;
			}
			case 4: {
				pet.petNapTime();
				break;
			}
			case 5: {
				break;
			}

			}
			pet.tick();
		} while (true);
	}
}