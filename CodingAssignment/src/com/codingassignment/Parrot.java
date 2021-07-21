package com.codingassignment;

public class Parrot extends Bird {

	private String livingNextTo = "";


	public Parrot(String livingNextTo) {
		this.livingNextTo = livingNextTo;
	}

	@Override
	public String sing() {
		switch (livingNextTo) {
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
