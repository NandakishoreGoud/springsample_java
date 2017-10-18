package enums;

public enum AdditionalFares {
	AcCharge(2), DiscountOnBus((int) 0.02);
	private double fares;

	AdditionalFares(int AdditionalFare) {
		this.fares = AdditionalFare;
	}

	public double getAdditionalFares() {
		return fares;
	}
}
