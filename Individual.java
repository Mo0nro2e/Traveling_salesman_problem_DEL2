public class Individual {
  //Attributes
  private City[] cities;

  //Constructor
  public Individual(City[] cities) {
    int random = RandomUtils.getRandomValue(cities.length);
    int lastIndex = cities.length - 1;
    City aux = cities[random];
    cities[random] = cities[lastIndex];
    cities[lastIndex] = aux;
    this.cities = cities; 
    
  }

  //Returns a copy of this individual's path.
  public City[] path() {

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
}


