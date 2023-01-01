package enums;

public enum Continents {
	NORTH_AMERICA(21330000,592072212),
	SOUTH_AMERICA(17461112,430759766),
	ANTARCTICA(13720000,0),
	ASIA(31033131,	4641054775L),
	EUROPE(22134900,747636026),
	AFRICA(29648481,1340598147),
	OCEANIA(8486460,43111704);
	
	
	private final double area;
	private final long population;
	


	 Continents (double area, long population) {
		this.area=area;
		this.population=population;
	}



	public double getArea() {
		return area;
	}



	public long getPopulation() {
		return population;
	}
	 
}
