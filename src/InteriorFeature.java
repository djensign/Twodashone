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

    return null;  //Return instance of a string?
  }

  @Override
  public void setFeature(String feature) {

    System.out.println(interiorFeature);
  }

  @Override
  public String toString() {
    return "InteriorFeature{" +
        "interiorFeature='" + interiorFeature + '\'' +
        '}';
  }
}
