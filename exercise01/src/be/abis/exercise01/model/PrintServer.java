package be.abis.exercise01.model;

public class PrintServer extends Node implements PrintingStrategy {

	private PrintingStrategy printingStrategy;

	public PrintServer(String string) {
	}


	@Override
	public void receive(Packet packet){
		if (packet.getDestinationAddress().equals(this.getAddress())){
			    this.print(packet);
		}  else {
     	        this.send(packet);
	}

	public void print(Packet packet) {
		System.out.println("print Package " + packet);
	}
		else
			send(packet)

	}
}
