package com.codingassignment;

public class Solution {

	public static void main(String[] args) {

		Bird bird = new Bird();
		bird.walk();
		bird.sing();
		bird.fly();

		Duck duck = new Duck();
		Chicken chicken = new Chicken("chicken");
		Chicken rooster = new Chicken("rooster");
		Parrot parrot1 = new Parrot("dog");
		Parrot parrot2 = new Parrot("cat");
		Parrot parrot3 = new Parrot("rooster");
		Fish shark = new Fish("large", "grey", "eat other fish");
		Fish clownFish = new Fish("small", "orange", "makes joke");
		Dolphin dolphin = new Dolphin();
		Butterfly butterfly = new Butterfly("butterfly");
		Butterfly caterpillar = new Butterfly("caterpillar");

		Animal[] animals = new Animal[] { bird, duck, chicken, rooster, parrot1, parrot2, parrot3, shark, clownFish,
				dolphin, butterfly, caterpillar };

		int canWalkCount = 0;
		int canFlyCount = 0;
		int canSingCount = 0;
		int canSwimCount = 0;

		for (Animal animal : animals) {
			if (animal.isCanWalk())
				canWalkCount++;

			if (animal.isCanFly())
				canFlyCount++;

			if (animal.isCanSing())
				canSingCount++;

			if (animal.isCanSwim())
				canSwimCount++;
		}

		System.out.println("No. of animals that can walk: " + canWalkCount);
		System.out.println("No. of animals that can fly: " + canFlyCount);
		System.out.println("No. of animals that can sing: " + canSingCount);
		System.out.println("No. of animals that can swim: " + canSwimCount);
	}
}
