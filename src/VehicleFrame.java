public class VehicleFrame implements Chassis {

  public String vehicleFrameType;

  public VehicleFrame() {

    this.vehicleFrameType = Engine.generic;
  }

  public VehicleFrame(String vehicleFrameType) {

    this.vehicleFrameType = vehicleFrameType;
  }

  public Chassis getChassisType() {

    return this;
  }

  public Chassis setChassisType(String vehicleFrameType) {

    this.vehicleFrameType = vehicleFrameType;
    return null;
  }

  public String toString() {

    return "Chassis : " + chassis + "\n" + "Vehicle Frame : " + vehicleFrameType;
  }
}
