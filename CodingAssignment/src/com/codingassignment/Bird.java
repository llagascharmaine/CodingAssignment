package com.codingassignment;

public class Bird implements Animal {

	@Override
	public boolean isCanWalk() {
		return true;
	}

	@Override
	public boolean isCanFly() {
		return true;
	}

	@Override
	public boolean isCanSwim() {
		return false;
	}

	@Override
	public boolean isCanSing() {
		return true;
	}

	@Override
	public String walk() {
		return "I am walking";
	}

	@Override
	public String fly() {
		return "I am flying";
	}

	@Override
	public String swim() {
		return "I can't swim";
	}

	@Override
	public String sing() {
		return "I am singing";
	}
}
