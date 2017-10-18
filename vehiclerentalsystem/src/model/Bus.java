package model;

public class Bus extends Vehicle {
	String fuelType;

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = "Diesel";
	}

	@Override
	public final boolean isAc() {
		return false;
	}

}
