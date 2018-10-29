import java.util.Date;

public class ManufacturedEngine implements Engine {

  String engineManufacturer;
  Date engineManufacturedDate;
  String engineMake;
  String engineModel;
  int engineCylinders;
  String engineType;
  String driveTrain;


  public ManufacturedEngine() {

    this.engineManufacturer = generic;
    this.engineManufacturedDate = Date;
    this.engineMake = generic;
    this.engineModel = generic;
    this.engineCylinders = 0;
    this.engineType = "85 AKI";
    this.driveTrain = "2WD: Two-wheel drives";
  }

  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, int engineCylinders, String engineType,
      String driveTrain) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {

  }

  @Override
  public void setEngineManufacturedDate(Date date) {

  }

  @Override
  public void setEngineManufacturer(String manufacturer) {

  }

  @Override
  public void setEngineMake(String engineMake) {

  }

  @Override
  public void setEngineModel(String engineModel) {

  }

  @Override
  public void setDriveTrain(String driveTrain) {

  }

  @Override
  public void setEngineType(String fuel) {

  }
}
