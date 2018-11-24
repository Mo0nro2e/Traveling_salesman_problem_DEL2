public class Individual {
  //Attributes
  private City[] cities;

  //Constructor
  public Individual(City[] cities) {
    //copies the array to avoid issues with pointers
    individual = new City[cities.length];
    for(int i=0; i<cities.length; i++)
      individual[i] = cities[i]; //.copy(); //er ikke sikker på om det er nødvendigt at lave copy her.
    //shuffles the array
    for(int i=0; i<individual.length; i++) {
      int randomIndex = RandomUtils.getRandomValue(individual.length);
      City auxiliaryVariable = cities[randomIndex];
      individual[randomIndex] = individual[i];
      individual[i] = auxiliaryVariable;
    }
  }

  //Returns a copy of this individual's path.
  public City[] path() {
   City[] copy = new City[individual.length];
   for(int i=0; i<individual.length; i++)
      copy[i] = individual[i];
   return copy;
  }

  //Returns the cost assigned to this individual's path.
  public double cost() {
    
  }

  //Performs a mutation of this individual.
  public void mutate() {

  }

  //Returns a new Individual differing from this one by a mutiation.
  public Individual reproduce() {

  }

  public String toString() {
    String city = "";
    String path = "";
    for(City c : individual) {
      city = c.name() + ", ";
      path = path + city;
    }
    return path;
  }

}


