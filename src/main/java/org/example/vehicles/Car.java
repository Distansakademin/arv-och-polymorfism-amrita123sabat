package org.example.vehicles;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    public String getCarInfo() {
        String features = displayFeatures();
        return features + " and has " + numberOfDoors + " doors";
    }

    @Override
    public void start() {
        System.out.println("Car starting...");
    }
    @Override
    public String startAndGetMessage() {
        return "Car starting...";
    }
}
