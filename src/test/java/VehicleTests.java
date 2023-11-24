import org.junit.jupiter.api.Test;
import org.example.vehicles.Vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTests {

    @Test

    public void testDisplayFeatures() {
        var brand = "Toyota";
        var speed = 100;
        var vehicle = new Vehicle(brand, speed);

        // Print the actual value to the console
        var actual = vehicle.displayFeatures();
        System.out.println("Actual: " + actual);

        // Perform the assertion
        var expected = "My " + brand + " is traveling at " + speed + " km/h";
        assertEquals(expected, actual);
    }


    @Test
    public void testStartAndGetMessage() {
        var vehicle = new Vehicle("Honda", 50);

        var expected = "Vehicle starting...";
        var actual = vehicle.startAndGetMessage();
        System.out.println("Actual: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testStart() {
        var vehicle = new Vehicle("Ford", 60);
        vehicle.start();
    }
}
