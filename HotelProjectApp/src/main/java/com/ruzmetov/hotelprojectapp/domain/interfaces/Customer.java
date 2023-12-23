package com.ruzmetov.hotelprojectapp.domain.interfaces;

import java.util.Date;
import java.util.UUID;

public interface Customer {

    UUID getCustomerId();

    String getFirstName();

    String getLastName();

    String getEmail();

    int getPhoneNumber();

    String getAddress();

    UUID getReservationId();

    String getReservationHistory();

    int getRoomNumber();

    UUID getServiceId();

    UUID getEventId();

    String getLoyalityPoints();

    Date getCheckInDate();

    String getCheckInStatus();

    Date getCheckOutDate();

    String getCheckOutStatus();

    int getTotalAmount();

    String getPaymentMethod();

    UUID getPaymentId();

    Date getCustomerTabCreate();

    Date getCustomerTabUpdate();

}
