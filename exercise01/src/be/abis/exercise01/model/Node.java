package be.abis.exercise01.model;

public class Node extends LanComponent {
	public Node(String adres) {
		super(adres);
	}

	@Override
	public void receive(Packet packet ) {
		super.receive(packet);
	}
	public void send(Packet packet){
		this.getNextComponent().receive(packet);
}

}
