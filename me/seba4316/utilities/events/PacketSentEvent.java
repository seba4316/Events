package me.seba4316.utilities.events;

import Event; // The event manager has been created by Hexeption: https://github.com/Hexeption/Hex-s-Event-System (Maybe I will create one later on)

import net.minecraft.network.Packet;

public class PacketSentEvent extends Event {

	private Packet packet;

	/** To hook this go into the class net.minecraft.network.NetworkManager, in the void #dispatchPacket and after the first 2 final declaration put this code: new PacketSentEvent(inPacket).call(); */

	public PacketSentEvent(Packet packet) {
		this.packet = packet;
		YourHackedClient.getInstance().getModuleManager().onPacketSent(this, packet); // If you don't use instances you can remove the #getInstance()
	}

	public Packet getPacket() {
		return packet;
	}
}