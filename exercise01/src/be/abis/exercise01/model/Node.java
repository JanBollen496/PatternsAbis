package be.abis.exercise01.model;

public class Node extends LanComponent {
	public Node(String str) {
	    super.getAddress(str);
	}

	@Override
	public void recieve(Packet) {
		super.recieve(Packet);
	}
	public void send(Packet){
       this.getNextComponent(Packet);
	}

}
