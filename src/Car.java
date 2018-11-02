import java.util.Arrays;
import java.util.Date;

public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car(Feature[] feature, int carAxle) {
    this.feature = feature;
    this.carAxle = carAxle;
  }

  public Car(Date vehicleManufacturedDate, String honda, String prelude, String coupe, VehicleChassis unibody,
      String aNull, String type, ManufacturedEngine manufacturedEngine, Feature[] f,
      int carAxle) {

    this.vehicleManufacturedDate = new Date();
    this.vehicleManufacturer = generic;
    this.vehicleMake = generic;
    this.vehicleModel = generic;
    this.vehicleFrame = setChassisType(generic);
    this.vehicleType = generic;
    this.driveTrain = generic;
    this.vehicleEngine = generic;

  }

  public void getExteriorFeatures() {
    System.out.println(Arrays.toString(feature));
  }

  public void getInteriorFeatures() {

    System.out.println(Arrays.toString(feature));
  }

  @Override
  public String toString() {
    return "Car{" +
        "feature=" + Arrays.toString(feature) +
        ", carAxle=" + carAxle +
        '}';
  }
}
