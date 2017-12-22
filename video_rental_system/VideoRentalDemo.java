import java.util.Calendar;
import java.util.GregorianCalendar;

public class VideoRentalDemo {

    public static void main(String[] args) {

        Video v1 = new Video();
        v1.setType(0);
        v1.setTitle("The Matrix");

        Video v2 = new Video();
        v2.setType(1);
        v2.setTitle("Charlie And The Chocolate Factory");

        Video v3 = new Video();
        v3.setType(2);
        v3.setTitle("Star War: The Last Jedi");

        Rental r1 = new Rental();
        r1.setVideo(v1);
        r1.setRentalDate(new GregorianCalendar(2017, Calendar.DECEMBER, 9).getTime());
        r1.setReturnDate(new GregorianCalendar(2017, Calendar.DECEMBER, 20).getTime());

        Checkout checkout = new Checkout();
        Customer customer = new Customer();
        customer.setName("Alan");
        checkout.setCustomer(customer);

        checkout.addRental(r1);

        Rental r2 = new Rental();
        r2.setVideo(v2);
        r2.setRentalDate(new GregorianCalendar(2017, Calendar.DECEMBER, 9).getTime());
        r2.setReturnDate(new GregorianCalendar(2017, Calendar.DECEMBER, 21).getTime());
     
        checkout.addRental(r2);


        Rental r3 = new Rental();
        r3.setVideo(v3);
        r3.setRentalDate(new GregorianCalendar(2017, Calendar.DECEMBER, 9).getTime());
        r3.setReturnDate(new GregorianCalendar(2017, Calendar.DECEMBER, 10).getTime());

        System.out.println("Charge: " + String.valueOf(checkout.getCharge()));

    }
}