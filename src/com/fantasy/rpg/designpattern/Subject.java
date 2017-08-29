/**
 * 
 */
package com.fantasy.rpg.designpattern;

public interface Subject {

	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers(String spellName);
}
