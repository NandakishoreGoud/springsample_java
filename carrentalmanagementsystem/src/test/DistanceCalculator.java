package test;

import java.util.HashMap;

import enums.TripDistance;

public class DistanceCalculator {
	public double getDistance(String TripDetails) {
		HashMap<String, Integer> tripDistance = new HashMap<String, Integer>();
		String[] tripDetails = TripDetails.split("-");
		String sourceCity = tripDetails[0];
		String destinationCity=tripDetails[1];
		for (TripDistance distance : TripDistance.values()) {
			tripDistance.put(distance.toString(), distance.getDistance());
		}
		double distance = tripDistance.get(sourceCity) + tripDistance.get(destinationCity);
		return distance;
		
				
	}

}
