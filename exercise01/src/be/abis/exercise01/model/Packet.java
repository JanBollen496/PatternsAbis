package be.abis.exercise01.model;

public class Packet {
	String destinationAddress;
	String contents;

	public Packet() {}

	public Packet(String destinationAddress, String contents) {
		this.destinationAddress = destinationAddress;
		this.contents = contents;
	}


	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
}
