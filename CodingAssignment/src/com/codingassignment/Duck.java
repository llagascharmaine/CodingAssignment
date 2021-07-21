package com.codingassignment;

public class Duck extends Bird {

	@Override
	public boolean isCanSwim() {
		return true;
	}

	@Override
	public String swim() {
		return "I am swimming";
	}

	@Override
	public String sing() {
		return "Quack quack";
	}
}
