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
	}
}

class Animal {

	private boolean canWalk = true;
	private boolean canFly, canSwim, canSing = false;

	public void setCanWalk(boolean canWalk) {
		this.canWalk = canWalk;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}

	public boolean isCanSing() {
		return canSing;
	}

	public void setCanSing(boolean canSing) {
		this.canSing = canSing;
	}

	public String walk() {
		return "I am walking";
	}

	public boolean isCanWalk() {
		return canWalk;
	}

	public String fly() {
		return "I can't fly";
	}

	public String swim() {
		return "I can't swim";
	}

	public String sing() {
		return "I can't sing";
	}
}

class Bird extends Animal {

	public Bird() {
		this.setCanFly(true);
		this.setCanSing(true);
	}

	@Override
	public String fly() {
		return "I am flying";
	}

	@Override
	public String sing() {
		return "I am singing";
	}

}

class Duck extends Bird {

	public Duck() {
		this.setCanSwim(true);
	}

	@Override
	public String sing() {
		return "Quack quack";
	}

	@Override
	public String swim() {
		return "I am swimming";
	}

}

class Chicken extends Bird {

	private String name = "chicken";

	public String getName() {
		return name;
	}

	public Chicken(String name) {
		this.name = name;
		this.setCanFly(false);
	}

	@Override
	public String sing() {
		switch (getName()) {
		case "rooster":
			return "Cock-a-doodle-doo";

		default:
			return "Cluck cluck";
		}
	}

	@Override
	public String fly() {
		return "I can't fly";
	}
}

class Parrot extends Bird {

	private String livingNextTo = "";

	public String getLivingNextTo() {
		return livingNextTo;
	}

	public Parrot(String livingNextTo) {
		this.livingNextTo = livingNextTo;
	}

	@Override
	public String sing() {
		switch (getLivingNextTo()) {
		case "dog":
			return "Woof, woof";

		case "cat":
			return "Me ow";

		case "rooster":
			return "Cock-a-doodle-doo";

		default:
			return "tweet tweet";
		}
	}
}


