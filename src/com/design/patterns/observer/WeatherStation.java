package com.design.patterns.observer;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay curdisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(1, 2, 3);
	}

}
