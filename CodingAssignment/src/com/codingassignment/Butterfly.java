package com.codingassignment;

public class Butterfly implements Animal {

	private String metamorphosisStage = "buttefly";

	public String getMetamorphosisStage() {
		return metamorphosisStage;
	}

	public Butterfly(String metamorphosisStage) {
		this.metamorphosisStage = metamorphosisStage;
	}

	@Override
	public boolean isCanWalk() {
		if (metamorphosisStage == "caterpillar") {
			return true;
		}
		return false;
	}

	@Override
	public boolean isCanFly() {
		if (metamorphosisStage == "butterfly") {
			return true;
		}
		return false;
	}

	@Override
	public boolean isCanSwim() {
		return false;
	}

	@Override
	public boolean isCanSing() {
		return false;
	}

	@Override
	public String swim() {
		return "I can't swim";
	}

	@Override
	public String sing() {
		return "I can't sing";
	}

	@Override
	public String walk() {
		if (metamorphosisStage == "butterfly") {
			return "I can't walk";
		} else {
			return "I am walking";
		}
	}

	@Override
	public String fly() {
		if (metamorphosisStage == "butterfly") {
			return "I am flying";
		} else {
			return "I can't fly";
		}
	}
}
