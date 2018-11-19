import java.util.Date;

public class ManufacturedEngine implements Engine {

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;


  public ManufacturedEngine() {

    this.engineManufacturer = generic;
    this.engineManufacturedDate = new Date();
    this.engineMake = generic;
    this.engineModel = generic;
    this.engineCylinders = 0;
    this.engineType = generic;
    this.driveTrain = generic;
  }

  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, String engineType, int engineCylinders,
      String driveTrain) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineType = engineType;
    this.engineCylinders = engineCylinders;
    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {

    this.engineCylinders = engineCylinders;
  }

  @Override
  public void setEngineManufacturedDate(Date date) {

    this.engineManufacturedDate = date;
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {

    this.engineManufacturer = manufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {

    this.engineMake = engineMake;
  }

  @Override
  public void setEngineModel(String engineModel) {

    this.engineModel = engineModel;
  }

  @Override
  public void setDriveTrain(String driveTrain) {

    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineType(String engineType) {

    this.engineType = engineType;
  }

  @Override
  public String toString() {
    return "Engine Manufacturer : " + engineManufacturer + "\n" +
        "Engine Manufactured : " + engineManufacturedDate + "\n" +
        "Engine Make : " + engineMake + "\n" +
        "Engine Model : " + engineModel + "\n" +
        "Engine Type : " + engineType + "\n" +
        "Engine Cylinders : " + engineCylinders + "\n" +
        "Drive Train : " + driveTrain;
  }
}
