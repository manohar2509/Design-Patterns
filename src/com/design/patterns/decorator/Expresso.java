package com.design.patterns.decorator;

public class Expresso extends Beverage {

	public Expresso() {
		this.setDescription("Expresso");
	}
	@Override
	public double cost() {
		return 1.99;
	}
	

}
