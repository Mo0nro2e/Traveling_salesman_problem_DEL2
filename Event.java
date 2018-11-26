public class Event {
  //Attributes
  private char type;
  private double time;
  private Individual individual;

  //Constructor
  public Event(char type, double time, Individual individual){
    this.type = Character.toUpperCase(type);
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
      case 'M':
        eventType = "Event type: Mutation, ";
        break;
      case 'D':
        eventType = "Event type: Death, ";
        break;
      case 'R':
        eventType = "Event type: Reproduction, ";
    }
    return eventType + "time: " + time + ", individual: " + individual;
  }

}
