package model;

public class Trip {
	String sourceCity, destinationCity;
	Vehicle vehicle;
	
	public Trip(String sourceCity, String destinationCity) {
		this.sourceCity = sourceCity;
		this.destinationCity = destinationCity;
	}

	public String getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(String sourceCity) {
		this.sourceCity = "Mumbai";
	}



	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

}
