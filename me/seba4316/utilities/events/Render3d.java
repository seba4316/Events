package me.seba4316.utilities.events;

import Event; // The event manager has been created by Hexeption: https://github.com/Hexeption/Hex-s-Event-System (Maybe I will create one later on)

public class Render3d extends Event {

	private float partialTicks;
	
	public Render3d(float partialTicks) {
		this.partialTicks = partialTicks;
		YourHackedClient.getInstance().getModuleManager().onRender3d(this); // If you don't use instances you can remove the #getInstance()
	}

	
	public float getPartialTicks() {
		return partialTicks;
	}

}