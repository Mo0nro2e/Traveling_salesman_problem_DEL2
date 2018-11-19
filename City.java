public class Event {
  //Attributes
  private char type;
  private double time;
  private Individual individual;

  //Constructor
  public Event(char type, double time, Individual individual){
    this.type = type;
    this.time = time;
    this.individual = individual;
  }

  //Getters
  public Individual individual() {
    return individual;
  }
  public double time() {
    return time;
  }
  public char type() {
    return type;
  }

  //Returns a textual representation of this event.
  public String toString() {
    return "Event type: " + type() + ", time: " + time() + ", individual: " + individual();
  }

}




















}
