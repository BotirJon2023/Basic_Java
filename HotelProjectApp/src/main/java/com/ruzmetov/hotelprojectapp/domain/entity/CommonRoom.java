package com.ruzmetov.hotelprojectapp.domain.entity;

import com.ruzmetov.hotelprojectapp.domain.interfaces.Room;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Table
@Entity


public class CommonRoom implements Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_number")
    private int roomNumber;

    @Column(name = "room_category")
    private String roomCategory;

    @Column(name = "room_ocupancy")
    private int roomMaxOccupancy;

    @Column(name = "room_price_per_night")
    private int roomPricePerNight;

    @Column(name = "room_total_number")
    private int roomTotalPrice;

    @Column(name = "room_availability")
    private boolean isAvailableRoom;

    @Column(name = "room_bed_numbers")
    private int bedNumbers;

    @Column(name = "view_from_room")
    private String viewFromRoom;

    @Column(name = "room_floor")
    private int roomFloor;

    @Column(name = "room_smoking_preferences")
    private String roomSmokingPreferences;

    @Column(name = "room_size")
    private double roomSize;

    @Column(name = "room_additional_service")
    private String roomAdditionallService;

    @Column(name = "room_breakfast_include")
    private boolean isBreakfastInclude;

    @Column(name = "room_checkIn_date")
    private Date checkInDate;

    @Column(name = "room_checkOut_date")
    private Date checkOutDate;

    @Column(name = "room_employee_id")
    private UUID employeeId;

    @Column(name = "room_administrator_id")
    private UUID administratorId;

    @Column(name = "room_tab_create")
    private Date roomTabCreate;

    @Column(name = "room_tab_update")
    private Date roomTabUpdate;

    public CommonRoom() {
    }

    public CommonRoom(int roomNumber, String roomCategory, int roomMaxOccupancy, int roomPricePerNight, int roomTotalPrice, boolean isAvailableRoom, int bedNumbers, String viewFromRoom, int roomFloor, String roomSmokingPreferences, double roomSize, String roomAdditionallService, boolean isBreakfastInclude, Date checkInDate, Date checkOutDate, UUID employeeId, UUID administratorId, Date roomTabCreate, Date roomTabUpdate) {
        this.roomNumber = roomNumber;
        this.roomCategory = roomCategory;
        this.roomMaxOccupancy = roomMaxOccupancy;
        this.roomPricePerNight = roomPricePerNight;
        this.roomTotalPrice = roomTotalPrice;
        this.isAvailableRoom = isAvailableRoom;
        this.bedNumbers = bedNumbers;
        this.viewFromRoom = viewFromRoom;
        this.roomFloor = roomFloor;
        this.roomSmokingPreferences = roomSmokingPreferences;
        this.roomSize = roomSize;
        this.roomAdditionallService = roomAdditionallService;
        this.isBreakfastInclude = isBreakfastInclude;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.employeeId = employeeId;
        this.administratorId = administratorId;
        this.roomTabCreate = roomTabCreate;
        this.roomTabUpdate = roomTabUpdate;
    }

    @Override
    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public String getRoomCategory() {
        return roomCategory;
    }

    @Override
    public int getRoomMaxOccupancy() {
        return roomMaxOccupancy;
    }

    @Override
    public int getRoomPricePerNight() {
        return roomPricePerNight;
    }

    @Override
    public int getRoomTotalPrice() {
        return roomTotalPrice;
    }

    @Override
    public boolean isAvailableRoom() {
        return false;
    }

    @Override
    public int getBedNumbers() {
        return bedNumbers;
    }

    @Override
    public String getViewFromRoom() {
        return viewFromRoom;
    }

    @Override
    public int getRoomFloor() {
        return roomFloor;
    }

    @Override
    public String getRoomSmokingPreferences() {
        return roomSmokingPreferences;
    }

    @Override
    public double getRoomSize() {
        return roomSize;
    }

    @Override
    public String getRoomAdditionallService() {
        return roomAdditionallService;
    }

    @Override
    public boolean isBreakfastInclude() {
        return false;
    }

    @Override
    public Date getCheckInDate() {
        return checkInDate;
    }

    @Override
    public Date getCheckOutDate() {
        return checkOutDate;
    }

    @Override
    public UUID getEmployeeId() {
        return employeeId;
    }

    @Override
    public UUID getAdministratorId() {
        return administratorId;
    }

    @Override
    public Date getRoomTabCreate() {
        return roomTabCreate;
    }

    @Override
    public Date getRoomTabUpdate() {
        return roomTabUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonRoom that = (CommonRoom) o;
        return roomNumber == that.roomNumber && roomMaxOccupancy == that.roomMaxOccupancy && roomPricePerNight == that.roomPricePerNight && roomTotalPrice == that.roomTotalPrice && isAvailableRoom == that.isAvailableRoom && bedNumbers == that.bedNumbers && roomFloor == that.roomFloor && Double.compare(roomSize, that.roomSize) == 0 && isBreakfastInclude == that.isBreakfastInclude && Objects.equals(roomCategory, that.roomCategory) && Objects.equals(viewFromRoom, that.viewFromRoom) && Objects.equals(roomSmokingPreferences, that.roomSmokingPreferences) && Objects.equals(roomAdditionallService, that.roomAdditionallService) && Objects.equals(checkInDate, that.checkInDate) && Objects.equals(checkOutDate, that.checkOutDate) && Objects.equals(employeeId, that.employeeId) && Objects.equals(administratorId, that.administratorId) && Objects.equals(roomTabCreate, that.roomTabCreate) && Objects.equals(roomTabUpdate, that.roomTabUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNumber, roomCategory, roomMaxOccupancy, roomPricePerNight, roomTotalPrice, isAvailableRoom, bedNumbers, viewFromRoom, roomFloor, roomSmokingPreferences, roomSize, roomAdditionallService, isBreakfastInclude, checkInDate, checkOutDate, employeeId, administratorId, roomTabCreate, roomTabUpdate);
    }

    @Override
    public String toString() {
        return "CommonRoom{" +
                "roomNumber=" + roomNumber +
                ", roomCategory='" + roomCategory + '\'' +
                ", roomMaxOccupancy=" + roomMaxOccupancy +
                ", roomPricePerNight=" + roomPricePerNight +
                ", roomTotalPrice=" + roomTotalPrice +
                ", isAvailableRoom=" + isAvailableRoom +
                ", bedNumbers=" + bedNumbers +
                ", viewFromRoom='" + viewFromRoom + '\'' +
                ", roomFloor=" + roomFloor +
                ", roomSmokingPreferences='" + roomSmokingPreferences + '\'' +
                ", roomSize=" + roomSize +
                ", roomAdditionallService='" + roomAdditionallService + '\'' +
                ", isBreakfastInclude=" + isBreakfastInclude +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", employeeId=" + employeeId +
                ", administratorId=" + administratorId +
                ", roomTabCreate=" + roomTabCreate +
                ", roomTabUpdate=" + roomTabUpdate +
                '}';
    }
}