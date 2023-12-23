package com.ruzmetov.hotelprojectapp.domain.interfaces;

import java.util.Date;
import java.util.UUID;

public interface Report {

    UUID getReportId();

    Date getStartDate();

    Date getEndDate();

    String getRevenueByRooms();

    String getRevenueByEvent();

    String getRevenueByService();

    String getOccupiedRooms();

    String getVacantRooms();

    String getReviewScoresAndFeedback();

    String getCancellationRates();

    UUID getAccessEmployeeId();

    UUID getAccessAdministratorId();

    Date getReportTabCreate();

    Date getReportTabUpdate();

}
