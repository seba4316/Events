package me.seba4316.utilities.events;

import Event; // The event manager has been created by Hexeption: https://github.com/Hexeption/Hex-s-Event-System (Maybe I will create one later on)

public class EventPostMotionUpdate extends Event {
	
	public EventPostMotionUpdate() {
		YourHackedClient.getInstance().getModuleManager().onPostMotion(this); // If you don't use instances you can remove the #getInstance()
	}
	
}