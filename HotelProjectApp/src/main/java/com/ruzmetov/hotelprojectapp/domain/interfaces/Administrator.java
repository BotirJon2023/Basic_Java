package com.ruzmetov.hotelprojectapp.domain.interfaces;

import java.util.UUID;

public interface Administrator {

    UUID getAdministratorId();

    String getFirstName();

    String getLastName();

    String getPassword();

    String getEmail();

    String getDepartament();

    String getPosition();

    String getFeedbackReview();

    String getReportAccess();

}
