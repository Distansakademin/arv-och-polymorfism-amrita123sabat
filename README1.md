# Vehicle Project
This Java project demonstrates object-oriented programming concepts, focusing on inheritance,
method overriding, and polymorphism through the implementation of a simple vehicle hierarchy.

## Classes
### Vehicle
The base class representing a generic vehicle.
- `brand` (String): The brand of the vehicle.
- `speed` (int): The speed of the vehicle.
Methods:
- `displayFeatures()`: Displays the features of the vehicle.
- `start()`: Prints a message indicating the vehicle is starting.
- `startAndGetMessage()`: Returns a starting message.
### Car
A subclass of `Vehicle` representing a car.
- `numberOfDoors` (int): The number of doors the car has.
Methods:
- `getCarInfo()`: Returns information about the car, including the number of doors.
### Motorcycle
Another subclass of `Vehicle` representing a motorcycle.
- `hasSideCar` (boolean): Indicates whether the motorcycle has a sidecar.
Methods:
- `getMotorcycleInfo()`: Returns information about the motorcycle, including the presence of a
- sidecar.
### Truck
A subclass of `Vehicle` representing a truck.
- `loadCapacity` (int): The load capacity of the truck in tons.
Methods:
- `getTruckInfo()`: Returns information about the truck, including the load capacity.
## Usage
1. Import the project into your preferred Java IDE (e.g., IntelliJ IDEA).
2. Run the main class (`Main` or similar) to see examples of vehicle creation and method calls.
## Additional Details
- Source code available on [GitHub Classroom](https://classroom.github.com/a/AUS4j4fh).


