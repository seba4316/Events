package me.seba4316.utilities.events;

import Event; // The event manager has been created by Hexeption: https://github.com/Hexeption/Hex-s-Event-System (Maybe I will create one later on)

public class EventPreMotionUpdate extends Event {

	private double x;
	private double y;
	private double z;
	private float yaw;
	private float pitch;
	private boolean ground;

	public EventPreMotionUpdate(double x, double y, double z, float yaw, float pitch, boolean ground) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.yaw = yaw;
		this.pitch = pitch;
		this.ground = ground;
		YourHackedClient.getInstance().getModuleManager().onPreMotionUpdate(this); // If you don't use instances you can remove the getInstance()
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	public float getYaw() {
		return yaw;
	}

	public void setYaw(float yaw) {
		this.yaw = yaw;
	}

	public float getPitch() {
		return pitch;
	}

	public void setPitch(float pitch) {
		this.pitch = pitch;
	}

	public boolean onGround() {
		return ground;
	}

	public void setGround(boolean ground) {
		this.ground = ground;
	}

}