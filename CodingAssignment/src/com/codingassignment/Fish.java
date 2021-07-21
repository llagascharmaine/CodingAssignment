package com.codingassignment;

public class Fish implements Animal {

	private String size = "";
	private String color = "";
	private String uniqueAbility = "";

	public Fish(String size, String color, String uniqueAbility) {
		this.size = size;
		this.color = color;
		this.uniqueAbility = uniqueAbility;
	}

	public String getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	public String getUniqueAbility() {
		return uniqueAbility;
	}

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
		return false;
	}

	@Override
	public String fly() {
		return "I can't fly";
	}

	@Override
	public String sing() {
		return "I can't sing";
	}

	@Override
	public String walk() {
		return "I can't walk";
	}

	@Override
	public String swim() {
		return "I am swimming";
	}

}
