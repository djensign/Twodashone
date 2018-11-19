import java.util.Date;

public class Vehicle implements Engine, Chassis {

  public Date vehicleManufacturedDate;
  public String vehicleManufacturer;
  public String vehicleMake;
  public String vehicleModel;
  public Chassis vehicleFrame;
  public String vehicleType;
  public String driveTrain;
  public Engine vehicleEngine;


  public Vehicle() {
    this.vehicleManufacturedDate = new Date();
    this.vehicleManufacturer = generic;
    this.vehicleMake = generic;
    this.vehicleModel = generic;
    this.vehicleFrame = new VehicleFrame();
    this.vehicleType = generic;
    this.driveTrain = generic;
    this.vehicleEngine = new ManufacturedEngine();
  }

  public Vehicle(String vehicleManufacturer, Date vehicleManufacturedDate, String vehicleMake,
      String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain,
      Engine vehicleEngine) {
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;
  }

  //engine methods
  @Override
  public void setEngineCylinders(int engineCylinders) {

    System.out.println(engineCylinders);
  }

  @Override
  public void setEngineManufacturedDate(Date date) {

    System.out.println(date);
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {

    System.out.println(manufacturer);
  }

  @Override
  public void setEngineMake(String engineMake) {

    System.out.println(engineMake);
  }

  @Override
  public void setEngineModel(String engineModel) {

    System.out.println(engineModel);
  }

  @Override
  public void setDriveTrain(String driveTrain) {

    System.out.println(driveTrain);
  }

  @Override
  public void setEngineType(String fuel) {

    System.out.println(fuel);
  }

  //chassis methods
  @Override
  public Chassis getChassisType() {

    return null;
  }

  @Override
  public Chassis setChassisType(String vehicleChassis) {
    System.out.println(vehicleChassis);
    return null;
  }

  @Override
  public String toString() {
    return "Manufacturer Name : " + this.vehicleManufacturer + "\n" +
        "Manufactured Date : " + this.vehicleManufacturedDate + "\n" +
        "Vehicle Make : " + this.vehicleMake + "\n" +
        "Vehicle Model : " + this.vehicleModel + "\n" +
        "Vehicle Type : " + vehicleType + "\n" +
        vehicleEngine + "\n";
  }
}
