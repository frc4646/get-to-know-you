package frc.dave;

class Oldsmobile implements Vehicle {
  @Override
  public String revMotor() {
    return "vroom vroom";
  }
}

class Tesla implements Vehicle {
  @Override
  public String revMotor() {
    return "buzz";
  }
}

public class Demo {
  public static void main(String[] args) {
    Person mentor = new Person("Dave");

    System.out.println(mentor);
    mentor.buyVehicle(new Oldsmobile());
    System.out.println(mentor);
    mentor.buyVehicle(new Tesla());
    System.out.println(mentor);
  }
}
