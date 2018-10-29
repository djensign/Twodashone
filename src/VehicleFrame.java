public class VehicleFrame implements Chassis {

  public String vehicleFrameType;

  public VehicleFrame() {

    this.vehicleFrameType = "Unibody";
  }

  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  public Chassis getChassisType() {
    return this;
  }

  public void setChassisType(String vehicleFrameType) {

    this.vehicleFrameType = vehicleFrameType;
  }

  public String toString() {
    return "Chassis : " + chassis + "\n" + "Vehicle Frame : " + vehicleFrameType;
  }
}
