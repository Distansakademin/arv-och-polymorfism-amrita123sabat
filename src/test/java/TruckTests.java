import org.junit.jupiter.api.Test;
import org.example.vehicles.Truck;
import org.example.vehicles.Vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TruckTests {

    @Test
    public void testGetTruckInfo() {
        var brand = "Volvo";
        var speed = 90;
        var loadCapacity = 5;
        var truck = new Truck(brand, speed, loadCapacity);
        var expected = "My " + brand + " is a truck traveling at " + speed + " km/h " +
                "with a load capacity of " + loadCapacity + " tons";
        var actual = truck.displayFeatures();

        assertEquals(expected, actual, "Truck information does not match.");
    }


    @Test
    public void testStart() {
        var truck = new Truck("Ford", 60, 8);
        System.out.println("Before starting:");
        truck.start();
        System.out.println("After starting:");
    }
    @Test
    public void testStartAndGetMessage() {
        // Arrange
        var truck = new Truck("Mercedes", 70, 12);
        var message = truck.startAndGetMessage();
        System.out.println("Start message: " + message);
    }
}