public class City{
	private String name;
	private double yCoordinate, xCoordinate ;

	public City(String name, double xCoordinate, double yCoordinate){
		this.name = name;
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;

	}


	public String getName(){
		return name;
	}

	public double getX(){
		return xCoordinate;
	}

	public double getY(){
		return yCoordinate;
	}

	public double distanceTo(City ohter){
		return (Math.sqrt(Math.pow(this.xCoordinate - ohter.getX(),2) + Math.pow(this.yCoordinate - ohter.getY(),2)));
	}




















}
