public class City{
	private String name;
	private double yCoordinate, xCoordinate ;

	public City(String name, double x, double y){
		this.name = name;
		this.x = x;
		this.y = y;
	}


	public String getName(){
		return name;
	}

	public double x(){
		return x;
	}

	public double y(){
		return y;
	}

	public double distanceTo(City ohter){
		return (Math.sqrt(Math.pow(this.xCoordinate - ohter.x(),2) + Math.pow(this.yCoordinate - ohter.y(),2)));
	}




















}
