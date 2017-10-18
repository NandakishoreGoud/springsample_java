package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class Trip {
    private Vehicle vehicle;
    List<Vehicle> vehiclesList = new ArrayList<>();

    public void addItem(Vehicle vehicle) {
        vehiclesList.add(vehicle);
    }
}
