public class Main {
	public static void main(String[] args) {

		City[] byer;
		Individual bob;
	 	byer = new CityGenerator().generate();
	 	bob = new Individual(byer);
	 	bob.path();



<<<<<<< Updated upstream
		//System.out.println(bob.cost());
=======

		System.out.println(bob.cost());
>>>>>>> Stashed changes
	}

}
