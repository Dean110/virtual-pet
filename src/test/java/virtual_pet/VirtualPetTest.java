package virtual_pet;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {
	@Test
	public void shouldHaveDefaultNameBruce() {
		VirtualPet underTest = new VirtualPet();
		String result = underTest.getName();
		Assert.assertEquals("Bruce", result);
	}

	@Test
	public void shouldSetNameInConstructor() {
		VirtualPet underTest = new VirtualPet("Bosco");
		String result = underTest.getName();
		Assert.assertEquals("Bosco", result);
	}

	@Test
	public void shouldSetADefaultHungerAt1() {
		VirtualPet underTest = new VirtualPet();
		int result = underTest.getHunger();
		Assert.assertEquals(1, result);
	}

	@Test
	public void shouldSetADefaultThirstAt1() {
		VirtualPet underTest = new VirtualPet();
		int result = underTest.getThirst();
		Assert.assertEquals(1, result);
	}

	@Test
	public void shouldSetADefaultBoredomAt1() {
		VirtualPet underTest = new VirtualPet();
		int result = underTest.getBoredom();
		Assert.assertEquals(1, result);
	}

	@Test
	public void shouldSetADefaultTirednessAt1() {
		VirtualPet underTest = new VirtualPet();
		int result = underTest.getTiredness();
		Assert.assertEquals(1, result);
	}

	@Test
	public void tickShouldChangeHungerBy1() {
		VirtualPet underTest = new VirtualPet();
		underTest.tick();
		int result = underTest.getHunger();
		Assert.assertEquals(2, result);
	}

	@Test
	public void tickShouldChangeThirstBy1() {
		VirtualPet underTest = new VirtualPet();
		underTest.tick();
		int result = underTest.getThirst();
		Assert.assertEquals(2, result);
	}

	@Test
	public void tickShouldChangeBoredomBy1() {
		VirtualPet underTest = new VirtualPet();
		underTest.tick();
		int result = underTest.getBoredom();
		Assert.assertEquals(2, result);
	}

	@Test
	public void tickShouldChangeTirednessBy1() {
		VirtualPet underTest = new VirtualPet();
		underTest.tick();
		int result = underTest.getTiredness();
		Assert.assertEquals(2, result);
	}

	@Test
	public void feedPetShouldReduceHungerBy20() {
		VirtualPet underTest = new VirtualPet();
		underTest.feedPet();
		int result = underTest.getHunger();
		Assert.assertEquals(-19, result);
	}

	@Test
	public void waterPetShouldReduceThirstBy20() {
		VirtualPet underTest = new VirtualPet();
		underTest.waterPet();
		int result = underTest.getThirst();
		Assert.assertEquals(-19, result);
	}

	@Test
	public void playWithPetShouldReduceBoredomBy20() {
		VirtualPet underTest = new VirtualPet();
		underTest.playWithPet();
		int result = underTest.getBoredom();
		Assert.assertEquals(-19, result);
	}

	@Test
	public void petNapTimeShouldReduceTirednessBy20() {
		VirtualPet underTest = new VirtualPet();
		underTest.petNapTime();
		int result = underTest.getTiredness();
		Assert.assertEquals(-19, result);
	}

	@Test
	public void displayStatusShouldOutputStatus() {
		VirtualPet underTest = new VirtualPet();
		String result = underTest.displayStatus();
		Assert.assertEquals("Bruce\nHunger: 1\nThirst: 1\nBoredom: 1\nTiredness: 1", result);
	}
}
