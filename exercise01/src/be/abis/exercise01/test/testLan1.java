package be.abis.exercise01.test;

import be.abis.exercise01.model.LanComponent;
import be.abis.exercise01.model.Node;
import be.abis.exercise01.model.Packet;
import be.abis.exercise01.model.PrintServer;
import be.abis.exercise01.model.WorkStation;


public class testLan1 {
	public static void main(String[] args) {


	 LanComponent ws1 = new WorkStation("Workstation");
	 LanComponent n1 = new Node("node1");
	 LanComponent ps1 = new PrintServer("Printserver1");
	 LanComponent n2 = new Node("node2");
	 LanComponent ps2 = new PrintServer("Printserver2");
	 LanComponent n3 = new Node("node3");
	 LanComponent ps3 = new PrintServer("Printserver3");

  ws1.setNextComponent(n1);
  	n1.setNextComponent(ps1);
    ps1.setNextComponent(n2);
	n2.setNextComponent(ps2);
	ps2.setNextComponent(n3);
	n3.setNextComponent(ps3);
	ps3.setNextComponent(ws1);


	Packet p1 = new Packet("hallo","node2");

	if (ws1 instanceof WorkStation)	{
		((WorkStation)ws1).originate(p1);
	}
}
