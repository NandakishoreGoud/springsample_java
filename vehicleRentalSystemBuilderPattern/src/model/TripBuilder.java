package model;

import java.util.ArrayList;
import java.util.List;

public class TripBuilder {
    public  Trip prepareTrip() {
        Trip trip = new Trip();
        List<Trip> tripList = new ArrayList<>();
        tripList.add(new MumbaiTrip());
        return trip;
    }

}
