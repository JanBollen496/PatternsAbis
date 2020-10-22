package be.abis.exercise01.model;

public class PrintServer extends Node {

	public PrintServer(String) {
	}
	public void receive(Packet){
		this.recieve(Packet);
	};

	public void print(Packet){
		System.out.println("print Package " + Packet);
	}
}
