public class KidsPriceModel extends PriceModel {
    
    public double getNormalPrice() {
        return 1.50;
    }

    public double getOverchargePrice() {
        return 2;
    }

    public long getNonOverchargeDays() {
        return 14l;
    }

}