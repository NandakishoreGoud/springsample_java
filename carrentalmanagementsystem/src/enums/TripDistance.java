package enums;

public enum TripDistance {
	Pune(0), Mumbai(200), Bangalore(1000), Delhi(2050), Chennai((int) 1234.5);
	private int Tripdistance;

	TripDistance(int distance) {
		this.Tripdistance = distance;
		}
	public int getDistance(int Trip_distance) {
		return Trip_distance;
	}
	
}
