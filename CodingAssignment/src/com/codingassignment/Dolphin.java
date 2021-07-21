package com.codingassignment;

public class Dolphin implements Animal {

	@Override
	public boolean isCanWalk() {
		return false;
	}

	@Override
	public boolean isCanFly() {
		return false;
	}

	@Override
	public boolean isCanSwim() {
		return true;
	}

	@Override
	public boolean isCanSing() {
		return true;
	}

	@Override
	public String fly() {
		return "I can't fly";
	}

	@Override
	public String walk() {
		return "I can't walk";
	}

	@Override
	public String swim() {
		return "I am swimming";
	}

	@Override
	public String sing() {
		return "I am singing";
	}
}
