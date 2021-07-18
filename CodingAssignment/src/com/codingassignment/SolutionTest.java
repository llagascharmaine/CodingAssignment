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

}
