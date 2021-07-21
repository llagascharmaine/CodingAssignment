package com.codingassignment;

public class Chicken extends Bird {

	private String name = "";

	public String getName() {
		return name;
	}

	public Chicken(String name) {
		this.name = name;
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
	public boolean isCanFly() {
		return false;
	}

	@Override
	public String fly() {
		return "I can't fly";
	}
}
