package com.ruzmetov.hotelprojectapp.domain.interfaces;

import java.util.Date;
import java.util.UUID;

public interface Feedback {
    UUID getFeedbackId();

    int getRoomNumber();

    UUID getServiceId();

    UUID getEventId();

    int getSatisfactionRating();

    String getComments();

    String getCustomerFirstName();

    String getCustomerLastName();

    UUID getAccessAdministratorId();

    Date getFeedbackTabCreate();

    Date getFeedbackTabUpdate();

}
