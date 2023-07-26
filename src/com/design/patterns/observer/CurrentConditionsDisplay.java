package com.design.patterns.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temp;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerOberver(this);
	}
	@Override
	public void display() {
		System.out.println("Current Conditions: " + "temperature is "+  this.temp + "%F and humdity is " + this.humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();	
	}

}
