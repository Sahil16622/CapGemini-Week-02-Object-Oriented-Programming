package com.inheritance.singleinheritance.smarthomedevices;

public class Thermostat extends Device{

    double tempratureSetting;

    public Thermostat(int deviceId, String status, double tempratureSetting) {
        super(deviceId, status);
        this.tempratureSetting = tempratureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Status of device thermostat is: "+status);
    }
}
