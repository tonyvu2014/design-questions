import java.util.Date;

public class Rental {

    private Video video;
    private Date rentalDate;
    private Date returnDate;

    public void setVideo(Video video) {
        this.video = video;
    }

    public Video getVideo() {
        return this.video;
    }

    public void setRentalDate(Date date) {
        this.rentalDate = date;
    }

    public Date getRentalDate() {
        return this.rentalDate;
    }

    public void setReturnDate(Date date) {
        this.returnDate = date;
    }

    public Date getReturnDate() {
        return this.returnDate;
    }

    public double getCharge() {
        PriceModelFactory priceModelFactory = new PriceModelFactory();
        PriceModel priceModel = priceModelFactory.getPriceModel(video);

        Date chargeDate = this.returnDate == null? new Date(): this.returnDate;
        long rentalDays = getDifferenceDays(this.rentalDate, chargeDate);

        double charge = priceModel.getCharge(rentalDays);

        return charge;
    }

    private long getDifferenceDays(Date d1, Date d2) {
        long diff = d2.getTime() - d1.getTime();
        return  diff/(1000*60*60*24);
    }
}