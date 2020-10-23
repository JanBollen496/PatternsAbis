package be.abis.exercise01.model;

public class PrintServer extends Node  {

	private PrintingStrategy printingStrategy;

	public PrintServer(String adres,PrintingStrategy printStrategy) {
		super (adres);
		this.printingStrategy=printingStrategy;

	}
	public PrintingStrategy getPrintingStrategy() {
		return printingStrategy;
	}

	public void setPrintingStrategy(PrintingStrategy printingStrategy) {
		this.printingStrategy = printingStrategy;
	}


	public void receive(Packet packet) {
		if (packet.getDestinationAddress().equals(this.getAddress())) {
			this.print(packet);
		} else {
			this.send(packet);
		}
	}
	public void print(Packet packet) {
		System.out.println("I " + this.getAddress() + "Printed");
		this.print(packet);
	}
}
