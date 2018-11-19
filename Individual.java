public class Individual{

  private double cost;
  private City[] path;
  private cities[];


  public Individual(City[] cities){
      
    int i = cities.length - 1;
    int j = RandomUtils.getRandomValue(cities.length);
    City [] aux = new City[2];
    aux[0] = cities[i]; 
    aux[1] = cities[j];
    cities[i] = aux[1];
    cities[j] = aux[0];

  }

  /*public double cost(){
    return cost;
  }*/

  public City[] path(){
    for( int i=0; i < cities.length-1; i++){
      System.out.print(cities[i] + ", ");
    }
      
    return path;
  }

  




}
