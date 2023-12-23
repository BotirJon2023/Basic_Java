package com.ruzmetov.hotelprojectapp.domain.interfaces;

import org.hibernate.sql.model.ast.builder.TableMergeBuilder;

import java.util.Date;
import java.util.UUID;

public interface Event {
    UUID getEventId();

    String getEventName();

    String getEventDescription();

    Date getDate();

    Date getEventTimeBeginning();

    Date getEventTimeEnd();

    String getLocation();

    int getCapacity();

    String getOrganizedCompanyName();

    String getContactPersonName();

    String getEventCategory();

    double getTotalPrice();

    String getPaymentMethod();

    UUID getPaymentId();

    UUID getEmployeeId();

    String getAdministratorId();

    Date getEventTabCreate();

    Date getEventTabUpdate();

}
