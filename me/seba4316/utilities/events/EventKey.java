package me.seba4316.utilities.events;

import Event; // The event manager has been created by Hexeption: https://github.com/Hexeption/Hex-s-Event-System (Maybe I will create one later on)

public class EventKey extends Event {

	private int key;

	public EventKey(int key) {
		this.key = key;
		YourHackedClient.getInstance().getModuleManager().toggle(key); // If you don't use instances you can remove the #getInstance()
	}

	public int getKey() {
		return key;
	}

}