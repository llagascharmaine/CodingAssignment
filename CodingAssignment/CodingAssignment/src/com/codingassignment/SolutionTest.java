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
}
