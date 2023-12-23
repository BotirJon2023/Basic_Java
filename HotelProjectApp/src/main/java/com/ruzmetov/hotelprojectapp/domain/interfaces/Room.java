package com.ruzmetov.hotelprojectapp.domain.interfaces;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface Room {

    int getRoomNumber();

    String getRoomCategory();

    int getRoomMaxOccupancy();

    int getRoomPricePerNight();

    int getRoomTotalPrice();

    boolean isAvailableRoom();

    int getBedNumbers();

    String getViewFromRoom();

    int getRoomFloor();

    String getRoomSmokingPreferences();

    double getRoomSize();

    String getRoomAdditionallService();

    boolean isBreakfastInclude();

    Date getCheckInDate();

    Date getCheckOutDate();

    UUID getEmployeeId();

    UUID getAdministratorId();

    Date getRoomTabCreate();

    Date getRoomTabUpdate();

}
