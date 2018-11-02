public class VehicleChassis implements Chassis {

  //String instance variable
  public String chassisName;

  //default constructor
  public VehicleChassis() {

    this.chassisName = chassis;
  }

  //overloaded constructor
  public VehicleChassis(String chassisName) {

    this.chassisName = chassisName;
  }

  public Chassis getChassisType() {

    return this;
  }

  public Chassis setChassisType(String vehicleChassis) {

    chassisName = vehicleChassis;
    return null;
  }

  public String toString() {

    return "Chassis Name : " + chassisName;
  }


}
