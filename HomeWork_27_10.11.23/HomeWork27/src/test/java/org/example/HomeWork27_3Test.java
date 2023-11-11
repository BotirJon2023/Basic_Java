package org.example;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeWork27_3Test {

    @Test
    public void testCreatePhoneList() {
        HomeWork27_3 yourClass = new HomeWork27_3();  // Replace YourClass with the actual name of your class

        List<Long> phoneList = yourClass.createPhoneList();

        // Assuming the contents of "1.txt" are known
        assertEquals(3, phoneList.size());  // Adjust the expected size based on your input data

        // Add more assertions based on your specific requirements
        assertEquals(1234567890L, phoneList.get(0).longValue());
        assertEquals(9876543210L, phoneList.get(1).longValue());
        assertEquals(5555555555L, phoneList.get(2).longValue());
    }

    @Test
    public void testProcessPhoneList() {
        HomeWork27_3 yourClass = new HomeWork27_3();  // Replace YourClass with the actual name of your class

        List<Long> phoneList = yourClass.createPhoneList();

    }
}
