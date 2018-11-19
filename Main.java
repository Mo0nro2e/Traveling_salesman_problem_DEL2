public class Main {
	public static void main(String[] args) {
		Individual bob;
	 	City[] listeafbyer = new CityGenerator().generate();
	 	bob = new Individual(listeafbyer);
	 	System.out.println(bob.path());

	}

}
