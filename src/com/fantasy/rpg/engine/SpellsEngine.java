package com.fantasy.rpg.engine;

import java.util.ArrayList;
import java.util.List;

import com.fantasy.rpg.designpattern.Observer;
import com.fantasy.rpg.designpattern.Subject;

public class SpellsEngine implements Subject {
	
	private List<Observer> subscribers;
	
	public List<Observer> getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(List<Observer> subscribers) {
		this.subscribers = subscribers;
	}
	
	public SpellsEngine(){
		this.subscribers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		subscribers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		subscribers.remove(observer);
	}

	@Override
	public void notifyObservers(String spellName) {
		for(Observer subscriber: subscribers){
			subscriber.update(spellName);
		}
	}
}
