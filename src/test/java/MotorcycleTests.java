import org.junit.jupiter.api.Test;
import org.example.vehicles.Motorcycle;
import org.example.vehicles.Vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorcycleTests {


    @Test
    public void testMotorcycleInfoWithoutSideCar() {
        Motorcycle motorcycle = new Motorcycle("Honda", 100, false);
        String expected = "My Honda is traveling at 100 km/h without a sidecar";
        assertEquals(expected, motorcycle.getMotorcycleInfo());
        System.out.println("Test MotorcycleInfoWithoutSideCar passed");
    }

    @Test
    public void testMotorcycleInfoWithSideCar() {
        Motorcycle motorcycle = new Motorcycle("Harley", 120, true);
        String expected = "My Harley is traveling at 120 km/h with a sidecar";
        assertEquals(expected, motorcycle.getMotorcycleInfo());
        System.out.println("Test MotorcycleInfoWithSideCar passed");
    }

    @Test
    public void testStart() {
        Motorcycle motorcycle = new Motorcycle("Suzuki", 80, false);
        String expected = "Motorcycle starting...";
        String actual = motorcycle.startAndGetMessage().trim();  

        System.out.println("Expected: '" + expected + "'");
        System.out.println("Actual  : '" + actual + "'");

        assertEquals(expected, actual);
        System.out.println("Test Start passed");
    }

}
