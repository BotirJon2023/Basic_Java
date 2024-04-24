package org.example;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class MyServiceTest {

    @Autowired
    private MyService myService;

    @Test
    void testGetMessage() {
        String message = myService.getMessage();
        assertEquals("default message", message);
    }
}