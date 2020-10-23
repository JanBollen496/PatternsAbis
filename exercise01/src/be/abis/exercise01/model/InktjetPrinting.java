package be.abis.exercise01.model;

public class InktjetPrinter implements PrintingStrategy {
	public InktjetPrinter() {
		super()
	}

	@Override
	public void print(Packet packet) {
		System.out.println("Print with Inktjetprinter" + packet.getContents() );
	}
}
