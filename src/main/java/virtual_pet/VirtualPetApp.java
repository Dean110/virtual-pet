package virtual_pet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet pet = new VirtualPet();
		int userInput = input.nextInt();
		
		
			System.out.println(pet.displayStatus());
	
	}
}