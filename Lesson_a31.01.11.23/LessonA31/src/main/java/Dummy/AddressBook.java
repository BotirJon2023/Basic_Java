package Dummy;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    public List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        if (customer == null) throw new NullPointerException();
        customers.add(customer);
    }

    public void clear() {
        customers.clear();
    }

    public void remove(Customer customer) {
        if (customer == null) throw new NullPointerException();
        customers.remove(customer);
    }

    public int getNumberOfCustomers() {
        return customers.size();
    }
}
