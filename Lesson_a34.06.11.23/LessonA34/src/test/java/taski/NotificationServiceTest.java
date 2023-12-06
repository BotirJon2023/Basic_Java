package taski;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class NotificationServiceTest {
    @Mock
    User user;
    @Mock
    String subject;
    @Mock
    String message;
    @Mock
    EmailService emailService;

    @Test
    void notifyUserPositiveTest() {

            user.getEmail("test@gmail.com");
            when(sensor.isBlocked()).thenReturn(false);
            assertEquals(sensor, thermometer.getSensor());
            assertEquals(250.0, thermometer.getTemperature(), 0.1);
            verify(sensor, times(1)).isBlocked();
        }

    }

    @Test
    void notifyUserNegativeTest() {
    }
}