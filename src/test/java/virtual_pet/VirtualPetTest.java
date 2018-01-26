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
}
