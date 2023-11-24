package org.example.vehicles;


public class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String displayFeatures() {
        return "My " + brand + " is traveling at " + speed + " km/h";
    }

    public void start() {
        System.out.println("Vehicle starting...");
    }
    public String startAndGetMessage() {
        return "Vehicle starting...";
    }
}