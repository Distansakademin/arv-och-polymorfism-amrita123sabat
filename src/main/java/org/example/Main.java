
package org.example;

import org.example.vehicles.Car;
import org.example.vehicles.Motorcycle;
import org.example.vehicles.Truck;
import org.example.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create a car named "VolvoCar"
        var myCar = new Car("VolvoCar", 240, 4);
        var carInfo = myCar.getCarInfo();
        System.out.println(carInfo);

        var myTruck = new Truck("FordTruck", 180, 8);

        var truckFeatures = myTruck.displayFeatures();
        System.out.println(truckFeatures);

        // Demonstrate method overriding
        System.out.println("\n---- Overridden Methods Demo ----");
        overrideDemo();

        startVehicle(myCar);
        startVehicle(myTruck);
        polymorphismDemo();
    }

    private static void startVehicle(Vehicle vehicle) {
        // Demonstrate starting different vehicles
        System.out.print("Starting: ");
        vehicle.start();
        System.out.println();
    }

    private static void displayInfo(Vehicle vehicle) {
        System.out.println(vehicle.displayFeatures());
    }
    private static void overrideDemo() {
        Vehicle genericVehicle = new Vehicle("GenericBus", 25);
        displayInfo(genericVehicle);
        Car myCar = new Car("MyCar", 25, 5);
        displayInfo(myCar);
        Motorcycle myMotorcycle = new Motorcycle("MyMotorcycle", 25, false);
        displayInfo(myMotorcycle);
        Truck myTruck = new Truck("MyTruck", 50, 10);
        displayInfo(myTruck);
    }

    private static void polymorphismDemo() {
        System.out.println("\n---- Polymorphism ---");
        List<Vehicle> vehicleList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(1, 100);

            if (randomNumber < 30) {
                Motorcycle myMotorcycle = new Motorcycle("RandomMotorcycle", 350 + i, true);
                vehicleList.add(myMotorcycle);
            } else if (randomNumber < 60) {
                Car myCar = new Car("RandomCar", 80 + i, 4);
                vehicleList.add(myCar);
            }
            else {
                Truck myTruck = new Truck("RandomTruck", 100 + i, 300);
                vehicleList.add(myTruck);
            }
        }

        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.displayFeatures());
        }
    }
}