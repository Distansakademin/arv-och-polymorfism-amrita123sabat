package org.example.vehicles;

public class Truck extends Vehicle {
    private final int loadCapacity;

    public Truck(String brand, int speed, int loadCapacity) {
        super(brand, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String displayFeatures() {
        // Override to include uniqueness characteristics of trucks
        String truckDisplay;
        truckDisplay = "My " + brand + " is a truck traveling at " + speed +
                " km/h with a load capacity of " + loadCapacity + " tons";

        return truckDisplay;
    }

    @Override
    public void start() {
        System.out.println("Truck starting...");
    }

    @Override
    public String startAndGetMessage() {
        return "Truck starting...";
    }
}
