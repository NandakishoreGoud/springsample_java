package model;


public abstract class Car implements Vehicle {
    @Override
    public boolean ac() {
        return false;
    }

    @Override
    public abstract String fuelType();

}
