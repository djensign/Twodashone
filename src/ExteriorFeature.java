public class ExteriorFeature implements Feature {

  public String exteriorFeature;

  public ExteriorFeature() {
    this.exteriorFeature = Engine.generic;
  }

  public ExteriorFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }


  @Override
  public String getFeature() {
    return Engine.generic;
  }

  @Override
  public void setFeature(String feature) {
    System.out.println(exteriorFeature);
  }

  @Override
  public String toString() {
    return "ExteriorFeature{" +
        "exteriorFeature='" + exteriorFeature + '\'' +
        '}';
  }
}
