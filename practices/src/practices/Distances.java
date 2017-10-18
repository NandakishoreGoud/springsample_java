package practices;


public enum Distances {
	Pune(0), Mumbai(200), Bangalore(1000), Delhi(2050), Chennai((int) 1234.5);
	private int distance;

	Distances(int distance) {
		this.distance = distance;
	}

	public int getDistance() {
		return distance;
	}
}