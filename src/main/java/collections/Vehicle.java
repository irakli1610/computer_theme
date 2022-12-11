package collections;

public class Vehicle {
	private String type;
	private int relaseYear;
	
	public Vehicle () {}
	
	
	public Vehicle(String type, int relaseYear) {
		super();
		this.type = type;
		this.relaseYear = relaseYear;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getRelaseYear() {
		return relaseYear;
	}
	@Override
	public String toString() {
		return " [type=" + type + ", relaseYear=" + relaseYear + "]";
	}


	public void setRelaseYear(int relaseYear) {
		this.relaseYear = relaseYear;
	}
}
