package com.lti.model;

public class Flight {
	int flightID;
	String source;
	String destination;
	
	public Flight() {
		super();
	}
	public Flight(int flightID, String source, String destination) {
		super();
		this.flightID = flightID;
		this.source = source;
		this.destination = destination;
	}
	public int getFlightID() {
		return flightID;
	}
	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	

}
