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
    this.vehicleFrame = setChassisType(generic);
    this.vehicleType = generic;
    this.driveTrain = generic;
    this.vehicleEngine = ;
  }

  public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
      String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain,
      Engine vehicleEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
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
    return "Vehicle{" +
        "vehicleManufacturedDate=" + vehicleManufacturedDate +
        ", vehicleManufacturer='" + vehicleManufacturer + '\'' +
        ", vehicleMake='" + vehicleMake + '\'' +
        ", vehicleModel='" + vehicleModel + '\'' +
        ", vehicleFrame='" + vehicleFrame + '\'' +
        ", vehicleType='" + vehicleType + '\'' +
        ", driveTrain='" + driveTrain + '\'' +
        ", vehicleEngine='" + vehicleEngine + '\'' +
        '}';
  }
}
