package test;

import enums.AdditionalFares;
import enums.StandardRate;
import model.Vehicle;

public class RateCalculator {
	public double getRatePerKM(Vehicle vehicle) {
		double ratePerKMPetrol = StandardRate.standardPetrolRatePerKM.getRate();
		double ratePerKMDiesel = StandardRate.standardDieselRatePerKM.getRate();
		double acCharge = AdditionalFares.AcCharge.getAdditionalFares();
		double ratePerKM=0;
		if (vehicle.getFuel().equalsIgnoreCase("petrol")) {
			if (vehicle.getAc().equalsIgnoreCase("NON-AC")) {
				ratePerKM = ratePerKMPetrol;
			} else {
				ratePerKM = ratePerKMPetrol + acCharge;
			}
		} else {
			if (vehicle.getAc().equalsIgnoreCase("NON-AC")) {

				ratePerKM = ratePerKMDiesel;
			} else {
				ratePerKM = ratePerKMDiesel + acCharge;
			}
		}
		return ratePerKM;
}}