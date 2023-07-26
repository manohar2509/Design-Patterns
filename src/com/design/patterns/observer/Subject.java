package com.design.patterns.observer;

public interface Subject {
	
	public void removeObserver(Observer o);
	public void registerOberver(Observer o);
	public void notifyObservers();
}
