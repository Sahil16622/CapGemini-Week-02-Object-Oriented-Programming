package com.inheritance.singleinheritance.smarthomedevices;

public class UseDevice {
    public static void main(String[] args) {

        Device device = new Device(102,"Heating");
        device.displayStatus();
        System.out.println();
        device = new Thermostat(104,"heating",40.0);
        device.displayStatus();

    }
}