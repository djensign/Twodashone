public class InteriorFeature implements Feature {

  public String interiorFeature;

  public InteriorFeature() {

    interiorFeature = Engine.generic;
  }

  public InteriorFeature(String interiorFeature) {

    this.interiorFeature = interiorFeature;
  }

  @Override
  public String getFeature() {

    return this.interiorFeature;
  }

  @Override
  public void setFeature(String feature) {

    this.interiorFeature = feature;
  }

  @Override
  public String toString() {
    return "Interior [" + interiorFeature + "]";
  }
}
