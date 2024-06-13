package com.electronics;

public class SmartPhone extends SmartDevice {
    public SmartPhone(String br, String md) {
        super(br, md);
    }
    public void makeCall() {
        System.out.println("Making a call");
    }
}
