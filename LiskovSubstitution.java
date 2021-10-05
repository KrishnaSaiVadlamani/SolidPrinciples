class Vehicle{
  public void start(){
    System.out.println("Vehicle Started");
    }
  public void stop(){
    System.out.println("Vehicle Stopped");
    }
} 
class Bike extends Vehicle{
  public void start(){
    System.out.println("Bike Started");
    }
  public void stop(){
    System.out.println("Bike Stopped");
    }
}
class Car extends Vehicle{
  public void start(){
    System.out.println("Car Started");
    }
  public void stop(){
    System.out.println("Car Stopped");
    }
}
class LiskovSubstitution{
  public static void testDrive(Vehicle vehicle){
  vehicle.start();
  vehicle.stop();
  }
  public static void main(String[] args){
  testDrive(new Vehicle());
  testDrive(new Bike());
  testDrive(new Car());
  }
}
