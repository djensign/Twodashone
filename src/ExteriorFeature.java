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

    return this.exteriorFeature;
  }

  @Override
  public void setFeature(String feature) {

    this.exteriorFeature = feature;
  }

  @Override
  public String toString() {
    return "Exterior [" + exteriorFeature + "]";
  }
}
