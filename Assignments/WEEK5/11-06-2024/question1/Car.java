package com.vehicles;

public class Car extends Vehicle {
    int numberOfDoors;

    public Car(String mk, String md, int nd) {
        super(mk, md);
        this.numberOfDoors = nd;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("The number of doors is: " + numberOfDoors);
    }
}
