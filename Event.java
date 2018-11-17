public class Event{

	private Individual;
	private double time;
	private char type;
	private double proba;

	public Event(Individual individual, double time, char type){
		this.Individual = individual;
		this.time = time;
		this.type = type;

	}

	public


	public double time(){
		return time;
	}

	public char type(){
		return type;
	}

	public Individual individual(){
		return individual;
	}

	public String toString(){
		if(type = 'M'){
			return "Mutation"
		}
		if(type = 'R'){
			return "Reproduction"
		}
		else{
			return "Death"
		}
	}
}
