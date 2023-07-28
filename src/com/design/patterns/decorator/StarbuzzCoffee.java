package com.design.patterns.decorator;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		
		Beverage beverage1 = new Expresso();
		Beverage beverage2 = new HouseBlend();
		Beverage beverage3 = new DarkRoast();
		
		beverage1 = new Mocha(beverage1);
		beverage1 = new Soy(beverage1);
		
		beverage2 = new Mocha(beverage2);
		beverage2 = new Soy(beverage2);
		
		beverage3 = new Mocha(beverage3);
		beverage3 = new Soy(beverage3);
		
		System.out.println(beverage1.getDescription() + " and cost is " + beverage1.cost());
		System.out.println(beverage2.getDescription() + " and cost is " + beverage2.cost());
		System.out.println(beverage3.getDescription() + " and cost is " + beverage3.cost());
	}

}
