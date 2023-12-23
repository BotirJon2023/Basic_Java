package com.ruzmetov.hotelprojectapp.domain.interfaces;

import java.util.Date;
import java.util.UUID;

public interface Employee {

    UUID getEmployeeId();

    String getFirstName();

    String getLastName();

    String getDepartament();

    String getEmployeePosition();

    Date getShiftStartTime();

    Date getShiftEndTime();

    String getFeedback();

    String getComplains();

    Date getEmployeeTabCreate();

    Date getEmployeeTabUpdate();

}
