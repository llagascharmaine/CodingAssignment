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

		assertEquals(bird.walk(), "I am walking");
		assertEquals(bird.fly(), "I am flying");
		assertEquals(bird.sing(), "I am singing");
	}

}
