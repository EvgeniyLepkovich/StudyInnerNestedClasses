package java.by.epam.anonymous.exampleone;

public class Engine {
	
	private int capacity;
	private int kwt;
	
	public Engine(int capacity, int kwt){
		this.capacity = capacity;
		this.kwt = kwt;
	}
	
	public int power(int capacity, int kwt){
		return capacity * kwt;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getKwt() {
		return kwt;
	}
	
	 

}
