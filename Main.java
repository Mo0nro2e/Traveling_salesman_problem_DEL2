public class Main {
	public static void main(String[] args) {
		City Slagelse = new City("Slagelse", 145.47, 438.85);
		City Nyborg = new City("Nyborg", 256.34, 354.65);

		Slagelse.distanceTo(Nyborg);
	}

}
