import java.util.Arrays;

public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {
    super();
    this.feature = null;
    this.carAxle = 0;
  }

  public Car(Feature[] feature, int carAxle) {
    super();
    this.feature = feature;
    this.carAxle = carAxle;
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
