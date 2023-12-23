package com.ruzmetov.hotelprojectapp.domain.interfaces;

import java.util.Date;
import java.util.UUID;

public interface Service {

    UUID getServiceId();

    boolean isBeakfastBooked();

    double getServiceBreakfastPrice();

    boolean isRestaurantBooked();

    double getServiceRestaurantPrice();

    boolean isBarBooked();

    double getServiceBarPrice();

    boolean isSwimmingPoolBooked();

    double getServiceSwimmingPoolPrice();

    boolean isGymBooked();

    double getServiceGymPrice();

    boolean isGarageBooked();

    double getServiceGaragePrice();

    boolean isAirportTransferBooked();

    double getServiceAirportTransferPrice();

    double getServiceTotalPrice();

    String getServicePaymentMethod();

    UUID getServicePaymentId();

    UUID getServiceEmployeeId();

    UUID getServiseAdministratorId();

    Date getServiceTabCreate();

    Date getServiceTabUpdate();

}
