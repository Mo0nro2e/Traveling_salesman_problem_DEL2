public class Event {
  //Attributes
  private char type;
  private double time;
  private Individual individual;
  public static final char MUTATION = 'M';
  public static final char REPRODUCTION = 'R';
  public static final char DEATH = 'D';

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
    String eventType = "";
    switch(type) {
      case MUTATION:
        eventType = "Event type: Mutation, ";
        break;
      case DEATH:
        eventType = "Event type: Death, ";
        break;
      case REPRODUCTION:
        eventType = "Event type: Reproduction, ";
    }

    return eventType + "time: " + time + ", individual: " + individual;
  }

}
