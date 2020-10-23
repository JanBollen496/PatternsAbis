package be.abis.exercise01.model;

public class WorkStation extends Node{

	public  Workstation(String adres){
		super(adres);
	}

	public void originate(Packet p){
        this.send(p);
	}




}
