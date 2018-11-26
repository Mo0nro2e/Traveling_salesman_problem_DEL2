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
    double sumOfCost = 0;
    double costBetweenTwoCities = 0;
    for(int i=1; i<individual.length; i++) {
      costBetweenTwoCities = individual[i-1].distanceTo(individual[i]);
      sumOfCost = sumOfCost + costBetweenTwoCities;

    }
    return sumOfCost + individual[individual.length-1].distanceTo(individual[0]);
  }

  //Performs a mutation of this individual.
  public void mutate() {
    int randomIndex = RandomUtils.getRandomValue(individual.length);
    int lastIndex = individual.length - 1;
    City auxiliaryVariable = individual[randomIndex]; //Pointer issue??
    individual[randomIndex] = individual[lastIndex];
    individual[lastIndex] = auxiliaryVariable;
  }
 
  //Returns a new Individual differing from this one by a mutiation.
  public Individual reproduce() {
    City[] offspring = new City[individual.length];
    for(int i = 0; i < offspring.length; i++){
      offspring[i] = individual[i];
    }
    int randomIndex = RandomUtils.getRandomValue(offspring.length);
    City auxiliaryVariable = offspring[randomIndex];
    individual[randomIndex] = offspring[offspring.length-1];
    offspring[offspring.length-1] = auxiliaryVariable;
    return 
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


