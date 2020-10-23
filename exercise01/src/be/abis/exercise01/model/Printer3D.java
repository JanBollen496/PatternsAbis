package be.abis.exercise01.model;

public class Printer3D implements PrintingStrategy {
	@Override
	public void print(Packet packet) {
		System.out.println("printing with Printer3D" + packet.getContents());
	}
}
