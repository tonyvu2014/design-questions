import java.util.List;
import java.util.ArrayList;

public class Checkout {

    private Customer customer;
    private List<Rental> rentals;

    public Checkout() {
        super();
        rentals = new ArrayList<>();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public double getCharge() {
        double total = 0;

        for (Rental r: rentals) {
            total += r.getCharge();
        }

        return total;
    }
}