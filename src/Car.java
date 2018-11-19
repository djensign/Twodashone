//This part was giving me the most issues, especially with the features.
//Had some help from websites and class mates to finish this part.

import java.util.Arrays;
import java.util.Date;

public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {
    super();

    Feature[] feature = {
        new InteriorFeature("No Interior Features"),
        new ExteriorFeature("No Exterior Features")};

    this.feature = feature;
    this.carAxle = 2;
  }

  public Car(String vehicleManufacturer, Date vehicleManufacturedDate, String vehicleMake,
      String vehicleModel, VehicleChassis vehicleFrame, String vehicleType, String driveTrain,
      ManufacturedEngine vehicleEngine, Feature[] feature, int carAxle) {

    super(vehicleManufacturer, vehicleManufacturedDate, vehicleMake
        , vehicleModel, vehicleFrame, vehicleType, driveTrain, vehicleEngine);

    this.feature = feature;
    this.carAxle = carAxle;

  }

  // http://javadevnotes.com/java-print-array-examples
  // String builder was giving me issues, went with string concatenation

  private String getInteriorFeatures() {
    String iF = "";
    for (int i = 0; i < this.feature.length; i++) {
      if (this.feature[i] instanceof InteriorFeature) {
        if (iF.length() == 0) {
          iF += this.feature[i];
        } else {
          iF += "\n" + this.feature[i];
        }
      }
    }
    return iF;
  }

  private String getExteriorFeatures() {
    String eF = "";
    for (int x = 0; x < this.feature.length; x++) {
      if (this.feature[x] instanceof ExteriorFeature) {
        if (eF.length() == 0) {
          eF += this.feature[x];
        } else {
          eF += "\n" + this.feature[x];
        }
      }
    }
    return eF;
  }

  @Override
  public String toString() {
    return super.toString() +
        "Features : \n" +
        getInteriorFeatures() + "\n" +
        getExteriorFeatures() + "\n" +
        "Car Axle : " + carAxle;
  }
}
