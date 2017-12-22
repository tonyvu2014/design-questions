public abstract class PriceModel {

    public abstract double getNormalPrice();
    public abstract double getOverchargePrice();
    public abstract long getNonOverchargeDays();
    
    public double getCharge(long rentalDays) {
        if (rentalDays <= getNonOverchargeDays()) {
            return rentalDays *  getNormalPrice();
        } else {
            return getNonOverchargeDays() * getNormalPrice() + (rentalDays - getNonOverchargeDays()) * getOverchargePrice();
        }
    }

}