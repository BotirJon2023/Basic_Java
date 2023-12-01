package Taski;


import Dummy.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BookTest {

    @Test
    void getTitle() {
    }

    @Test
    void getAuthor() {
    }

    @Test
    void getIsbn() {
    }

    @Test
    void getCopies() {
    }

    @Test
    void setCopies() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }

    static class AddressBookTest {
        private static final AddressBook ad = new AddressBook();
        private static final Customer MOCK = Mockito.mock(Customer.class);

        private Customer createCustomer() {
            State state = new State("CA");
            City city = new City("Los Angeles", state);
            Address address = new Address("City Avenue", city);
            return new Customer("Nik", "Nelson", address);
        }

        @BeforeEach
        void setUp() {
            ad.clear();
            ad.addCustomer(MOCK);
        }

        /**
         * Case 1.
         */
        @Test
        void addCustomerPositiveTest() {
            Customer customer = createCustomer();
            System.out.println(ad.getNumberOfCustomers() + "before");
            ad.addCustomer(customer);
            assertEquals(2, ad.getNumberOfCustomers());
            System.out.println(ad.getNumberOfCustomers() + "after");
        }

        /**
         * Case 2 with exception
         */
        @Test
        void addCustomerWithNullPointerExceptionTest() {
            Customer customer = null;
            assertThrows(NullPointerException.class, () -> ad.addCustomer(customer));
        }

        @Test
        void removeCustomerTest() {
            ad.remove(MOCK);
            assertEquals(0, ad.getNumberOfCustomers());
        }

        /**
         * Dummy object
         */
        @Test
        void addCustomerPositiveDUMMYTest() {
            Customer customer = Mockito.mock(Customer.class);
            ad.addCustomer(customer);
            assertEquals(2, ad.getNumberOfCustomers());
        }
    }
}