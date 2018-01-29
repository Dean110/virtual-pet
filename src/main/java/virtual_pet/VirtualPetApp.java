package virtual_pet;

import java.io.IOException;
import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		VirtualPet pet = new VirtualPet();

		do {
			pet.asciiArtDog();
			System.out.println(pet.getName());
			System.out.println("Hunger: " + pet.getHunger());
			System.out.println("Thirst: " + pet.getThirst());
			System.out.println("Boredom: " + pet.getBoredom());
			System.out.println("Tiredness: " + pet.getTiredness());
			System.out.println();
			System.out.println();
			System.out.println("What do you want to do?");
			System.out.println("1. Feed " + pet.getName());
			System.out.println("2. Water " + pet.getName());
			System.out.println("3. Play with " + pet.getName());
			System.out.println("4. Give " + pet.getName() + " a nap");
			System.out.println("5. Do nothing");

			int userInput = input.nextInt();
			for (int i = 0; i < 10; i++) {
				System.out.println();
			}
			switch (userInput) {
			case 1: {
				pet.feedPet();
				System.out.println("You fed " + pet.getName() + ".\n");
				break;
			}
			case 2: {
				pet.waterPet();
				System.out.println("You gave " + pet.getName() + " some water.\n");
				break;
			}
			case 3: {
				pet.playWithPet();
				System.out.println("You played with " + pet.getName() + ".\n");
				break;
			}
			case 4: {
				pet.petNapTime();
				System.out.println(pet.getName() + " took a nap.\n");
				break;
			}
			case 5: {
				System.out.println(pet.getName() + " stared at the clock trying to understand the meaning of life.\n");
				break;
			}

			}
			pet.tick();
			System.out.println();
		} while (pet.getPetIsAlive() && pet.getPetHasNotRunAway());

		System.out.println("Your pet is no longer with us.");

		input.close();
	}

}