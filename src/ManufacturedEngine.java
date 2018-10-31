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
    this.driveTrain = "2WD: Two-wheel drive";
  }

  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, String engineType, int engineCylinders,
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
    System.out.println(engineCylinders);
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    System.out.println(engineManufacturedDate);
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
  public void setEngineType(String engineType) {
    System.out.println(engineType);
  }

  @Override
  public String toString() {
    return "ManufacturedEngine{" +
        "engineManufacturer='" + engineManufacturer + '\'' +
        ", engineManufacturedDate=" + engineManufacturedDate +
        ", engineMake='" + engineMake + '\'' +
        ", engineModel='" + engineModel + '\'' +
        ", engineCylinders=" + engineCylinders +
        ", engineType='" + engineType + '\'' +
        ", driveTrain='" + driveTrain + '\'' +
        '}';
  }
}
