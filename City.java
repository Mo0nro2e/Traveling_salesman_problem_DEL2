public class City{
	private String name;
	private double xCoordinate;
	private double yCoordinate;

	public City(String name, double xCoordinate, double yCoordinate){
		this.name = name;
		System.out.println("The name of your city is" + name)
		this.xCoordinate = xCoordinate;
		System.out.println("" + name)
		this.yCoordinate = yCoordinate;
		System.out.println("with the coordinates" + yCoordinate "and" + xCoordinate );
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
