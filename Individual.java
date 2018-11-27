public class Individual {
  //Attributes
  private City[] individualPath;

  //Constructor
  Individual(City[] cities) {
    //copies the array to avoid issues with pointers
    individualPath = new City[cities.length];
    for(int i=0; i<cities.length; i++)
      individualPath[i] = cities[i];
    //shuffles the array
    for(int i=0; i<individualPath.length; i++) {
      int randomIndex = RandomUtils.getRandomValue(individualPath.length);
      while(randomIndex == i)
        randomIndex = RandomUtils.getRandomValue(individualPath.length);
      City auxiliaryVariable = individualPath[randomIndex];
      individualPath[randomIndex] = individualPath[i];
      individualPath[i] = auxiliaryVariable;
    }
  }

  public City[] path() {
    City[] copy = new City[individualPath.length];
    for(int i=0; i<individualPath.length; i++)
      copy[i] = individualPath[i];
    return copy;
  }

  public String toString() {
    String city = "";
    String path = "";
    for(City c : individualPath) {
      city = c.name() + ", ";
      path = path + city;
    }
    return path;
  }

  public double cost() {
    double sumOfCost = 0;
    double costBetweenTwoCities = 0;
    for(int i=1; i<individualPath.length; i++) {
      costBetweenTwoCities = individualPath[i-1].distanceTo(individualPath[i]);
      sumOfCost = sumOfCost + costBetweenTwoCities;

    }
    return sumOfCost + individualPath[individualPath.length-1].distanceTo(individualPath[0]);
  }


  public void mutate() {
    int randomIndexOne = RandomUtils.getRandomValue(individualPath.length);
    int randomIndexTwo = RandomUtils.getRandomValue(individualPath.length);
    City auxiliaryVariable = individualPath[randomIndexOne];
    individualPath[randomIndexOne] = individualPath[randomIndexTwo];
    individualPath[randomIndexTwo] = auxiliaryVariable;
  }


  //Returns a new Individual differing from this one by a mutiation.
  public Individual reproduce() {
    Individual offspring = new Individual(path());
    offspring.individualPath = path();
    offspring.mutate();
    return offspring;
  }

}
