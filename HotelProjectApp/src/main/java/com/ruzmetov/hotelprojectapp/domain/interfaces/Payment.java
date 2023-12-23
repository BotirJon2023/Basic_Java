package com.ruzmetov.hotelprojectapp.domain.interfaces;

import java.util.Date;
import java.util.UUID;

public interface Payment {

    UUID getPaymentId();

    int getRoomNumber();

    UUID getServiceId();

    UUID getEventId();

    String getCustomerFirstName();

    String getCustomerLastName();

    int getCreditCardNumber();

    Date getCreditCardExpiringDate();

    int getCreditCardCVV();

    String getPaymentMethod();

    double getTotalAmount();

    UUID getTransactionId();

    String getTransactionHistory();

    UUID getEmployeeId();

    UUID getAdministratorId();

    Date getPaymentTabCreate();

    Date getPaymentTabUpdate();

}
