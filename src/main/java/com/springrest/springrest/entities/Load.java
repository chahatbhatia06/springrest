package com.springrest.springrest.entities;

//import java.time.LocalDateTime;

public class Load {

	private int id;
    private String origin;
    private String destination;
    private double weight;   // Weight of the load
//    private LocalDateTime pickupDate;
    
    public Load(int id, String origin, String destination, double weight) {
		super();
		this.id = id;
		this.origin = origin;
		this.destination = destination;
		this.weight = weight;
//		this.pickupDate = i;
//		this.deliveryDate = j
	}
//	private LocalDateTime deliveryDate;

	public Load(int i ,String string, String string2, double d) {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

//	public LocalDateTime getPickupDate() {
//		return pickupDate;
//	}

//	public void setPickupDate(LocalDateTime pickupDate) {
//		this.pickupDate = pickupDate;
//	}

//	public LocalDateTime getDeliveryDate() {
//		return deliveryDate;
//	}

//	public void setDeliveryDate(LocalDateTime deliveryDate) {
//		this.deliveryDate = deliveryDate;
//	}

	@Override
	public String toString() {
		return "Load [id=" + id + ", origin=" + origin + ", destination=" + destination + ", weight=" + weight + "]";
	}

	
}
