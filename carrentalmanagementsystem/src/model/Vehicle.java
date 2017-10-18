package model;

public abstract class Vehicle {
	private String fuelType;
	public String ac;

	public String isAc() {
		return ac;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public String getFuel() {
		return fuelType;
	}

	public void setFuel(String fuel) {
		this.fuelType = fuel;
	}

	public Vehicle(String fuel, String ac) {
		super();
		this.fuelType = fuel;
		this.ac = ac;
	}

	public String getAc() {
		return null;
	}

}
