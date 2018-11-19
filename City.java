public class City {
  //Attributes
  private String name;
  private double x, y;

  //Constructor
  public City(String name, double x, double y) {
    this.name = name;
    this.x = x;
    this.y = y;
  }

  //Getters
  public double x() {
    return x;
  }
  public double y() {
    return y;
  }
  public String name() {
    return name;
  }

  //Returns the Euclidean distance between two cities.
  public double distanceTo(City other) {
    return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
  }

}
