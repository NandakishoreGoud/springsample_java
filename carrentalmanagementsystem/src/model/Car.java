package model;

public class Car extends Vehicle {

	private String name;

	public Car(String name, String fuel, String ac) {
		super(fuel, ac);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getAcCharges() {
		return 0;
		
	}

}
