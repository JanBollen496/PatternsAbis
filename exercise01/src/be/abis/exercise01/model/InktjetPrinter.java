package be.abis.exercise01.model;

public class InktjetPrinter implements PrintingStrategy {
	@Override
	public void print(Packet packet) {
		System.out.println("Printing with Inktjet" + packet.getContents() );
	}
}
