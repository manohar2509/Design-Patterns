package com.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

	private List<Observer> observers;
	private float temp;
	private float humidity;
	private float pressure;
	public WeatherData() {
		this.observers = new ArrayList<>();
	}
	
	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if(index>=0)
			observers.remove(index);
		
	}

	@Override
	public void registerOberver(Observer o) {
		observers.add(o);
	}

	@Override
	public void notifyObservers() {
		for(int i = 0 ;i < observers.size(); i++) {
			Observer o = observers.get(i);
			o.update(temp, humidity, pressure);
		}
	}
	public void measurementsChanged() {
		notifyObservers();
	}
	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
