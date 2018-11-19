public class City{
	private String name;
	private double xCoordinate;
	private double yCoordinate;

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
		return (Math.sqat(Math.pow(this.xCoordinate - City.getX(),2) + Math.pow(this.yCoordinate - City.getY(),2)));
	}




















}
