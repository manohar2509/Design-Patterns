package com.design.patterns.decorator;

public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		this.setDescription("Dark Roast");
	}

	@Override
	public double cost() {
		return 0.58;
	}

}
