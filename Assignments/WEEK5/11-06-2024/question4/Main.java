package com.test;
import com.electronics.SmartPhone;

public class Main {
    public static void main(String[] args) {
        SmartPhone myphone = new SmartPhone("Vivo", "Iqoo Z7");
        myphone.powerOn();
        myphone.connectToWiFi();
        myphone.makeCall();
    }
}
