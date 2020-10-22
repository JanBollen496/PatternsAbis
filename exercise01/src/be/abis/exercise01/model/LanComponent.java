package be.abis.exercise01.model;

public abstract class LanComponent {
	private String address;


	public LanComponent() {	}

	private LanComponent nextComponent;

	public LanComponent(String address) {
		this.address = address;
		this.nextComponent = nextComponent;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LanComponent getNextComponent() {
		return nextComponent;
	}

	public void setNextComponent(LanComponent nextComponent) {
		this.nextComponent = nextComponent;
	}

	public void send(Packet packet){

	}

	public void recieve(Packet packet){
         this.address=packet.getDestinationAddress();

		 }
	}

}
