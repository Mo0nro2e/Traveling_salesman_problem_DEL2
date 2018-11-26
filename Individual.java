public class Individual{


  private double cost;
  private City[] path;
  private City[] cities;
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
    this.cities = cities;
    }
  }

  /*public double cost(){
    return cost;
  }*/

  public City[] path(){
    City path[] = new City[cities.length];
    for (int i = 0; i< cities.length; i++){
      path[i] = cities[i];
    }
    return path;
  }
  public void mutate() {
    newPos = RandomUtils.getRandomValue(cities.length);
    aux = cities[RandomUtils.getRandomValue(cities.length)];
    cities[RandomUtils.getRandomValue(cities.length)] = cities[newPos];
    cities[newPos] = aux;
  }


  public Individual reproduce() {
    Individual bob[] = new Individual[cities.length];
    for(int i=0; i < cities.length; i++){
      bob[i] = cities[i]; 
    }
    bob.mutate();
    return Individual;
  }

    




}
