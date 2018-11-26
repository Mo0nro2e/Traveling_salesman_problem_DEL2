public class Individual{


  private double cost;
  private City[] path;
  private City[] individual;
  int index, newPos;
  City aux;


  public Individual(City[] cities){
  
    for (int i = cities.length - 1; i > 0; i--){
      index = RandomUtils.getRandomValue(cities.length);
      if (index != i)
      {
        newPos = RandomUtils.getRandomValue(cities.length);
        aux = cities[i];
        cities[i] = cities[newPos];
        cities[newPos] = aux;
      }
    }
  }

  public double cost(){
    double cost = cost + individual[individual.length-1].distanceTo(individual[0]);
    double costBetweenTwoCities = 0;
    for(int i=1; i<individual.length; i++) {
      costBetweenTwoCities = individual[i-1].distanceTo(individual[i]);
      cost = cost + costBetweenTwoCities;
    }
    return cost;
  }

  public City[] path(){
    City path[] = new City[individual.length];
    for (int i = 0; i< individual.length; i++){
      path[i] = individual[i];
    }
    return path;
  }
  public void mutate() {
    newPos = RandomUtils.getRandomValue(individual.length);
    aux = individual[RandomUtils.getRandomValue(individual.length)];
    individual[RandomUtils.getRandomValue(individual.length)] = individual[newPos];
    individual[newPos] = aux;
  }


  public Individual reproduce() {
    Individual bob[];
    for(int i=0; i < individual.length; i++){
      bob[i] = individual[i]; 
    }
    bob.mutate();
    return Individual;
  }

    




}
