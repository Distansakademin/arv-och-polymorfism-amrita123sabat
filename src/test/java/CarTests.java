import org.junit.jupiter.api.Test;
import org.example.vehicles.Car;
import org.example.vehicles.Vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CarTests {

    @Test
    public void testGetCarInfo() {
        var brand = "Toyota";
        var speed = 120;
        var numberOfDoors = 4;
        var car = new Car(brand, speed, numberOfDoors);


        var expected = "My " + brand + " is traveling at " + speed + " km/h and has " + numberOfDoors + " doors";
        var actual = car.getCarInfo();
        assertEquals(expected, actual);
        System.out.println("Car Info: " + actual);
    }

    @Test
    public void testStart() {

        var car = new Car("Honda", 80, 5);
        System.out.println("Before starting:");
        car.start();
        System.out.println("After starting:");
    }

    @Test
    public void testStartAndGetMessage() {
        // Arrange
        var car = new Car("Ford", 60, 3);

        // Act
        // Assuming the startAndGetMessage method prints to the console
        var message = car.startAndGetMessage();
        System.out.println("Start message: " + message);
    }
}