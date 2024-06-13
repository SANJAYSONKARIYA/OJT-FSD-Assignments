package com.electronics;

public class SmartDevice extends ElectronicDevice {
    public SmartDevice(String br, String md) {
        super(br, md);
    }
    public void connectToWiFi() {
        System.out.println("Connecting to WiFi");
    }
    
}
