package com.design.patterns.decorator;

public abstract class Beverage {
	private String description = "Unknown Description";
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public abstract double cost();

}
