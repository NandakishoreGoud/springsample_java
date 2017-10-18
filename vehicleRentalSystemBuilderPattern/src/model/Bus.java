package model;

public abstract class Bus implements Vehicle {
    @Override
    public boolean ac() {
        return false;
    }

    @Override
    public abstract String fuelType();

}
