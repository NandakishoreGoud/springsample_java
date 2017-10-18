package test;

import model.Bus;
import model.Trip;

public class TripExpenseCalculator {
	public static void main(String[] args) {
		Trip tripObject = new Trip("Mumbai","Pune");
		Bus bus = new Bus();
		double distance =  FareCalculatorwithDiscounts.getDistance();
		double ratePerKM =  FareCalculatorwithDiscounts.getFare(bus);
		double tripFare = utilityobj.calculateRent(bus, ratePerKM, distance);
		//System.out.println("Trip: " + bus.getModel() + ", " + bus.getAc() + ", " + "Mumbai-Delhi");
		System.out.println("Total expense: " + tripFare);
		
		
		
		
	}

}
