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
    double cost = individual[individual.length-1].distanceTo(individual[0]);
    for(int i=1; i<individual.length; i++) {
      cost += individual[i-1].distanceTo(individual[i]);
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
    Individual offSpring = new Individual(path);
    for(int i=0; i < cities.length; i++){
      bob[i] = cities[i]; 
    }
    offSpring.mutate();
    return offSpring;
  }

    




}
