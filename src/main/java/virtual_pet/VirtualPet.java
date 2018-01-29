package virtual_pet;

public class VirtualPet {
	// Instance Variables
	private String petName;
	private int petHunger;
	private int petThirst;
	private int petBoredom;
	private int petTiredness;
	private boolean petIsAlive = true;
	private boolean petHasNotRunAway = true;

	// Getters
	public String getName() {

		return petName;
	}

	public int getHunger() {
		return petHunger;
	}

	public int getThirst() {
		return petThirst;
	}

	public int getBoredom() {
		return petBoredom;
	}

	public int getTiredness() {
		return petTiredness;
	}

	public boolean getPetIsAlive() {

		return petIsAlive;
	}

	public boolean getPetHasNotRunAway() {
		return petHasNotRunAway;
	}

	// Constructors
	public VirtualPet() {
		this.petName = "Bruce";
		this.petHunger = 1;
		this.petThirst = 1;
		this.petBoredom = 1;
		this.petTiredness = 1;
	}

	public VirtualPet(String petName) {
		this.petName = petName;
	}

	// Class behavior methods
	public void tick() {
		this.petHunger++;
		this.petThirst++;
		this.petBoredom++;
		this.petTiredness++;
		// Consequences of needs not being met.
		if (this.petHunger > 75) {
			System.out.println(this.petName + " starts to gnaw at your leg.");
		}
		if (this.petThirst > 75) {
			System.out.println(this.petName + " is drinking out of the toilet.");
		}
		if (this.petBoredom > 75) {
			System.out.println(this.petName + " tore the couch apart!");
		}
		if (this.petTiredness > 75) {
			System.out.println(this.petName + " growls at anything that moves...");
		}
		if (this.petHunger > 100 || this.petThirst > 100) {
			this.petIsAlive = false;
		}
		if (this.petBoredom > 100 || this.petTiredness > 100) {
			this.petHasNotRunAway = false;
		}
	}

	public void feedPet() {
		this.petHunger -= 20;
		this.petThirst += 5;
if (this.petHunger <0) {
	this.petHunger = 0;
}
	}

	public void waterPet() {
		this.petThirst -= 20;
		this.petTiredness += 30;
		if (this.petThirst <0) {
			this.petThirst = 0;
		}
	}

	public void playWithPet() {
		this.petBoredom -= 20;
		this.petHunger += 10;
		this.petThirst += 10;
		if (this.petBoredom <0) {
			this.petBoredom = 0;
		}
	}

	public void petNapTime() {
		this.petTiredness -= 20;
		this.petHunger += 20;
		this.petThirst += 4;
		if (this.petTiredness <0) {
			this.petTiredness = 0;
		}
	}

	public String displayStatus() {
		return petName + "\nHunger: " + petHunger + "\nThirst: " + petThirst + "\nBoredom: " + petBoredom
				+ "\nTiredness: " + petTiredness;
	}
	public void asciiArtDog() {
		System.out.println("      /\\,_/\\  ");
		System.out.println("      /==_ (");
		System.out.println("     (Y_.) /       /// ");
		System.out.println("      U ) (__,_____) ) ");
		System.out.println("        )'   >     `/ ");
		System.out.println("        |._  _____  | ");
		System.out.println("        | | (    \\| ( ");
		System.out.println("        | | |    || | ");
		System.out.println("   ,,-. ),)_/ ., ))_/,,.-,_");
	}
}
