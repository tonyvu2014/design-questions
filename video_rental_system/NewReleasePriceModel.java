public class NewReleasePriceModel extends PriceModel {
    
    public double getNormalPrice() {
        return 2;
    }

    public double getOverchargePrice() {
        return 2.5;
    }

    public long getNonOverchargeDays() {
        return 20l;
    }

}