package org.example.vehicles;

public class Motorcycle extends Vehicle {
    private final boolean hasSideCar;

    public Motorcycle(String brand, int speed, boolean hasSideCar) {
        super(brand, speed);
        this.hasSideCar = hasSideCar;
    }

    public String getMotorcycleInfo() {
        String features = displayFeatures();
        return features + (hasSideCar ? " with a sidecar" : " without a sidecar");
    }

    @Override
    public void start() {
        System.out.println("Motorcycle starting...");
    }

    @Override
    public String startAndGetMessage() {
        return " Motorcycle starting...";
    }
}
