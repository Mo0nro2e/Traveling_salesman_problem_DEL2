public class Main {
	public static void main(String[] args) {
		
		City[] byer;
		Individual bob;
	 	byer = new CityGenerator().generate();
	 	bob = new Individual(byer);
	 	System.out.println(bob.path());

	}

}
