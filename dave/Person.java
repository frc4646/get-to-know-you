

public class Person {
  private final String name;
  private Vehicle vehicle = null;

  public Person(String name) {
    this.name = name;
  }

  public void buyVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  @Override
  public String toString() {
    String message = String.format("Hi, I'm %s", name);
    if (vehicle != null) {
      message += String.format(". My car goes %s.", vehicle.revMotor());
    }
    return message;
  }
}
