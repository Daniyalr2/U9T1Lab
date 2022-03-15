public class VehicleRunner
{
  public static void main(String[] args)
  { 
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    
    // testing all available methods on a Car object
    Car myCar = new Car("Honda Civic", 4, "leather");
    System.out.println(myCar.getName()); // inherited method
    System.out.println(myCar.getWheels()); // inherited method
    System.out.println(myCar.getFabric()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.honk(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects
 
    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object

    Bicycle myBicycle = new Bicycle("Epic Bike", 2, 5);
    System.out.println(myBicycle.getName());
    System.out.println(myBicycle.getWheels());
    myBicycle.turn(30);
    myBicycle.move(50);
    myBicycle.brake(40);
    System.out.println(myBicycle.getGearCount());
    myBicycle.ringBell();


    Plane myPlane = new Plane("Cool Plane", 3, 2, 4);
    System.out.println(myPlane.getName());
    System.out.println(myPlane.getWheels());
    myPlane.turn(20);
    myPlane.move(1000);
    myPlane.brake(5);
    myPlane.flyUp(30);
    System.out.println(myPlane.getWings());
    System.out.println(myPlane.getEngines());


    
    
    
        
  }
}