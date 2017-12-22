public class RegularPriceModel extends PriceModel {

    public double getNormalPrice() {
        return 2.50;
    }

    public double getOverchargePrice() {
        return 3;
    }

    public long getNonOverchargeDays() {
        return 10l;
    }

}