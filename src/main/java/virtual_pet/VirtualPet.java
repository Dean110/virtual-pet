package virtual_pet;

public class VirtualPet {
//Instance Variables
	private String petName;
	private int petHunger;
	private int petThirst;
	private int petBoredom;
	private int petTiredness;
	
//Getters
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
//Constructors
	public VirtualPet() {
		this.petName = "Bruce";
		this.petHunger = 1;
		this.petThirst= 1;
		this.petBoredom = 1;
		this.petTiredness = 1;
	}

	public VirtualPet(String petName) {
		this.petName = petName;

	}
	public void tick() {
	this.petHunger++;
	this.petThirst++;
	this.petBoredom++;
	this.petTiredness++;
	}


}
