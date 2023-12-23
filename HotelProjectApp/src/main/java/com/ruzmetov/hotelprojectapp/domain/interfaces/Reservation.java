package com.ruzmetov.hotelprojectapp.domain.interfaces;

import java.util.Date;
import java.util.UUID;

public interface Reservation {

    UUID getReservationId();

    String getCustomerFirstName();

    String getCustomerLastName();

    int getRoomNumber();

    UUID getEventId();

    UUID getServiceId();

    double getTotalAmount();

    String getPaymentMethod();

    UUID getPaymentId();

    String getCancellationInfo();

    Date getReservationCreate();

    Date getReservationUpdate();

    UUID getEmployeeId();

    UUID getAdministratorId();

}
