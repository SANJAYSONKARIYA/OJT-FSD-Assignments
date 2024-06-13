package com.vehicles;

public class Vehicle {
    private String make;
    private String model;

    public Vehicle(String mk, String md) {
        this.make = mk;
        this.model = md;
    }

    public void displayDetails() {
        System.out.println("The make of the vehicle is: " + make);
        System.out.println("The model of the vehicle is: " + model);
    }
}


