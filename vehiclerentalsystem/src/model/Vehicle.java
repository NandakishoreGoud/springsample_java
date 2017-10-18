package model;

public abstract class Vehicle {
	String vehicleType;
	String FuelType;

	public String getFuelType() {
		return FuelType;
	}

	public void setFuelType(String fuelType) {
		FuelType = fuelType;
	}

	public abstract boolean isAc();

}