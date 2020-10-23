package be.abis.exercise01.model;

public class LaserPrinter implements PrintingStrategy {
	@Override
	public void print(Packet packet) {
			System.out.println("printing with Laserprinter " + packet.getContents());
	}
}
