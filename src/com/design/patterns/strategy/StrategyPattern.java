package com.design.patterns.strategy;

public class StrategyPattern {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.display();
		duck.performFly();
		duck.performQuack();
		duck.setFlyBehaviour(new FlyNoWay());
		duck.setQuackBehaviour(new Squeak());
		duck.performFly();
		duck.performQuack();
	}

}
