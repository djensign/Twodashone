public class Main {

  public static void main(String[] args) {

    VehicleChassis myChassis = new VehicleChassis();
    VehicleChassis yourChassis = new VehicleChassis("cn");

    VehicleFrame myVehicle = new VehicleFrame();

    VehicleFrame myVehicleLadder = new VehicleFrame("Ladder Frame");

    System.out.println(myChassis.toString());
    System.out.println(myVehicle.toString());
    System.out.println(myVehicleLadder.toString());
  }


}
