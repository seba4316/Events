package me.seba4316.utilities.events;

import Event; // The event manager has been created by Hexeption: https://github.com/Hexeption/Hex-s-Event-System (Maybe I will create one later on)

public class Render2d extends Event {

	private int width;
	private int height;
	
	public Render2d(int width, int height) {
		this.width = width;
		this.height = height;
		YourHackedClient.getInstance().getModuleManager().onRender2d(this); // If you don't use instances you can remove the #getInstance()
	}

	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

}