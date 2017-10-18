package model;

public enum StandardRates {
	ratePerKMPetrol(9), BusDiscount(0.02), ratePerKMDiesel(8), acCharge(2);
	private int rate;
	double busDiscount;

	StandardRates(int rate) {
		this.rate = rate;

	}

	StandardRates(double busDiscount) {
		this.busDiscount = busDiscount;
	}

	public double getRate() {
		return rate;
	}

	public double getBusDiscount() {
		return busDiscount;
	}

}
