package com.design.patterns.strategy;

public abstract class Duck {
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehaviour.fly();
	}
	public void performQuack() {
		quackBehaviour.quack();
	}

}
