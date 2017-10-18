package model;


public abstract  class Suv  implements Vehicle{
    @Override
    public boolean ac() {
        return true;
    }

    @Override
    public abstract String fuelType();
}
