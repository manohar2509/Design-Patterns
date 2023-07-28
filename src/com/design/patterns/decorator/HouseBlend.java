package com.design.patterns.decorator;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		this.setDescription("HouseBlend");
	}
	@Override
	public double cost() {
		return 0.89;
	}

}
