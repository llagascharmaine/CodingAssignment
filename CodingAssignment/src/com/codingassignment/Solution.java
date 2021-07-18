package com.codingassignment;

public class Solution {

	public static void main(String[] args) {

		Bird bird = new Bird();
		bird.walk();
		bird.sing();
		bird.fly();
	}
}

class Animal {

	private boolean canWalk = true;
	private boolean canFly, canSing = false;

	public void setCanWalk(boolean canWalk) {
		this.canWalk = canWalk;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
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


