package com.codingassignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	@Test
	public void testBird() {
		Bird bird = new Bird();
		assertTrue(bird.isCanWalk());
		assertTrue(bird.isCanFly());
		assertTrue(bird.isCanSing());
		assertFalse(bird.isCanSwim());

		assertEquals(bird.walk(), "I am walking");
		assertEquals(bird.fly(), "I am flying");
		assertEquals(bird.sing(), "I am singing");
		assertEquals(bird.swim(), "I can't swim");
	}

	@Test
	public void testDuck() {
		Duck duck = new Duck();
		assertTrue(duck.isCanWalk());
		assertTrue(duck.isCanFly());
		assertTrue(duck.isCanSing());
		assertTrue(duck.isCanSwim());

		assertEquals(duck.walk(), "I am walking");
		assertEquals(duck.fly(), "I am flying");
		assertEquals(duck.sing(), "Quack quack");
		assertEquals(duck.swim(), "I am swimming");
	}

	@Test
	public void testChicken() {

		Chicken chicken = new Chicken("chicken");

		assertTrue(chicken.isCanWalk());
		assertFalse(chicken.isCanFly());
		assertTrue(chicken.isCanSing());
		assertFalse(chicken.isCanSwim());

		assertEquals(chicken.walk(), "I am walking");
		assertEquals(chicken.fly(), "I can't fly");
		assertEquals(chicken.sing(), "Cluck cluck");
		assertEquals(chicken.swim(), "I can't swim");

		Chicken rooster = new Chicken("rooster");

		assertTrue(rooster.isCanWalk());
		assertFalse(rooster.isCanFly());
		assertTrue(rooster.isCanSing());
		assertFalse(rooster.isCanSwim());

		assertEquals(rooster.walk(), "I am walking");
		assertEquals(rooster.fly(), "I can't fly");
		assertEquals(rooster.sing(), "Cock-a-doodle-doo");
		assertEquals(rooster.swim(), "I can't swim");
	}

	@Test
	public void testParrot() {
		Parrot parrotNextToDog = new Parrot("dog");
		assertTrue(parrotNextToDog.isCanWalk());
		assertTrue(parrotNextToDog.isCanFly());
		assertTrue(parrotNextToDog.isCanSing());
		assertFalse(parrotNextToDog.isCanSwim());

		assertEquals(parrotNextToDog.walk(), "I am walking");
		assertEquals(parrotNextToDog.fly(), "I am flying");
		assertEquals(parrotNextToDog.sing(), "Woof, woof");
		assertEquals(parrotNextToDog.swim(), "I can't swim");

		Parrot parrotNextToCat = new Parrot("cat");
		assertTrue(parrotNextToCat.isCanWalk());
		assertTrue(parrotNextToCat.isCanFly());
		assertTrue(parrotNextToCat.isCanSing());
		assertFalse(parrotNextToCat.isCanSwim());

		assertEquals(parrotNextToCat.walk(), "I am walking");
		assertEquals(parrotNextToCat.fly(), "I am flying");
		assertEquals(parrotNextToCat.sing(), "Me ow");
		assertEquals(parrotNextToCat.swim(), "I can't swim");

		Parrot parrotNextToRooster = new Parrot("rooster");
		assertTrue(parrotNextToRooster.isCanWalk());
		assertTrue(parrotNextToRooster.isCanFly());
		assertTrue(parrotNextToRooster.isCanSing());
		assertFalse(parrotNextToRooster.isCanSwim());

		assertEquals(parrotNextToRooster.walk(), "I am walking");
		assertEquals(parrotNextToRooster.fly(), "I am flying");
		assertEquals(parrotNextToRooster.sing(), "Cock-a-doodle-doo");
		assertEquals(parrotNextToRooster.swim(), "I can't swim");
	}

	@Test
	public void testFish() {

		Fish shark = new Fish("large", "grey", "eat other fish");
		assertFalse(shark.isCanWalk());
		assertFalse(shark.isCanFly());
		assertFalse(shark.isCanSing());
		assertTrue(shark.isCanSwim());

		assertEquals(shark.walk(), "I can't walk");
		assertEquals(shark.fly(), "I can't fly");
		assertEquals(shark.sing(), "I can't sing");
		assertEquals(shark.swim(), "I am swimming");

		assertEquals(shark.getSize(), "large");
		assertEquals(shark.getColor(), "grey");
		assertEquals(shark.getUniqueAbility(), "eat other fish");

		Fish clownFish = new Fish("small", "orange", "makes joke");
		assertFalse(clownFish.isCanWalk());
		assertFalse(clownFish.isCanFly());
		assertFalse(clownFish.isCanSing());
		assertTrue(clownFish.isCanSwim());

		assertEquals(clownFish.walk(), "I can't walk");
		assertEquals(clownFish.fly(), "I can't fly");
		assertEquals(clownFish.sing(), "I can't sing");
		assertEquals(clownFish.swim(), "I am swimming");

		assertEquals(clownFish.getSize(), "small");
		assertEquals(clownFish.getColor(), "orange");
		assertEquals(clownFish.getUniqueAbility(), "makes joke");

	}

	@Test
	public void testDolphin() {

		Dolphin dolphin = new Dolphin();
		assertFalse(dolphin.isCanWalk());
		assertFalse(dolphin.isCanFly());
		assertTrue(dolphin.isCanSing());
		assertTrue(dolphin.isCanSwim());

		assertEquals(dolphin.walk(), "I can't walk");
		assertEquals(dolphin.fly(), "I can't fly");
		assertEquals(dolphin.sing(), "I am singing");
		assertEquals(dolphin.swim(), "I am swimming");

	}

	@Test
	public void testButterfly() {

		Butterfly caterpillar = new Butterfly("caterpillar");
		assertTrue(caterpillar.isCanWalk());
		assertFalse(caterpillar.isCanFly());
		assertFalse(caterpillar.isCanSing());
		assertFalse(caterpillar.isCanSwim());

		assertEquals(caterpillar.walk(), "I am walking");
		assertEquals(caterpillar.fly(), "I can't fly");
		assertEquals(caterpillar.sing(), "I can't sing");
		assertEquals(caterpillar.swim(), "I can't swim");

		Butterfly butterfly = new Butterfly("butterfly");
		assertFalse(butterfly.isCanWalk());
		assertTrue(butterfly.isCanFly());
		assertFalse(butterfly.isCanSing());
		assertFalse(butterfly.isCanSwim());

		assertEquals(butterfly.walk(), "I can't walk");
		assertEquals(butterfly.fly(), "I am flying");
		assertEquals(butterfly.sing(), "I can't sing");
		assertEquals(butterfly.swim(), "I can't swim");
	}
}
