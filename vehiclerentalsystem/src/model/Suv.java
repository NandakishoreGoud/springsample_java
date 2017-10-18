package model;

public class Suv extends Vehicle {
	String fuelType;

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = "diesel";
	}

	public Suv() {
		super();
		this.fuelType = "diesel";
	}

	@Override
	public final boolean isAc() {

		return true;
	}

}
