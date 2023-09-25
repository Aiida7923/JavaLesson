package task42;

public class Eye {

  private double size;
  private double vision;
  private String color;

  public Eye(double size, double vision, String color) {
    this.size = size;
    this.vision = vision;
    this.color = color;
  }

  public void see() {
    System.out.println(vision * 5.0 + "m先まで見えました。");
  }

  public double getSize() {
    return size;
  }

  public double getVision() {
    return vision;
  }

  public String getColor() {
    return color;
  }
}
