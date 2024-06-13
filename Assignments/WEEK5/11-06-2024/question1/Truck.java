package com.vehicles;

public class Truck extends Vehicle {
    String payloadCapacity;

    public Truck(String mk, String md, String pc) {
        super(mk, md);
        this.payloadCapacity = pc;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Payload capacity: " + payloadCapacity);
    }
}
