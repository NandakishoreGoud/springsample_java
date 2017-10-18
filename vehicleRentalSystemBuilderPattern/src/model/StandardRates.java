package model;

public enum  StandardRates {
    ratePerKMPetrol(9), BusDiscount(0.02), ratePerKMDiesel(8), AcCharge(2);
private int rate;
double additionalCharges;

    StandardRates(int rate){
        this.rate = rate;
    }
    StandardRates(double additionalCharges) {
        this.additionalCharges = additionalCharges;
    }
    public double getAdditionalCharges(){
        return additionalCharges;
    }
    public  int getRate(){
        return rate;
    }
}
