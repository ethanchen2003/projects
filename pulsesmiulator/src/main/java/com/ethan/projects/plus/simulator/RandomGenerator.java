package com.ethan.projects.plus.simulator;

import java.util.Random;

public class RandomGenerator {
	private int max = 0;
	private int min = 0;

	private Random random = new Random();
	
	public RandomGenerator(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}

	public RandomGenerator() {
		this(55, 70);
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int nextNum() {
		int num = random.nextInt(max - min + 1) + min;
		return num;
	}
}

