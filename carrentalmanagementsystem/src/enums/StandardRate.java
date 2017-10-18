package enums;

public enum StandardRate {

	standardPetrolRatePerKM(9), standardDieselRatePerKM(8);
	private double rate;

	StandardRate(int StandardRate) {
		this.rate = StandardRate;
	}

 public	double getRate() {
		return rate;
	}
}
