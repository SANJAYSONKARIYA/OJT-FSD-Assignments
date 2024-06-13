package com.electronics;

public class ElectronicDevice {
    private String brand;
    private String model;
    
    public ElectronicDevice(String br, String md) {
        this.brand = br;
        this.model = md;
    }
    public void powerOn() {
        System.out.println("Powering on the electronic device");
    }
}
