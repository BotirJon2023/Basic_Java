package com.ruzmetov.hotelprojectapp.domain.entity;

import com.ruzmetov.hotelprojectapp.domain.interfaces.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Table
@Entity

public class CommonCustomer implements Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private UUID customerId;

    @Column(name = "customer_first_name")
    private String firstName;

    @Column(name = "customer_last_name")
    private String lastName;

    @Column(name = "customer_email")
    private String email;

    @Column(name = "customer_phone_number")
    private int phoneNumber;

    @Column(name = "customer_address")
    private String address;

    @Column(name = "customer_reservation_id")
    private UUID reservationId;

    @Column(name = "customer_reservation_history")
    private String reservationHistory;

    @Column(name = "customer_room_number")
    private int roomNumber;

    @Column(name = "customer_service_id")
    private UUID serviceId;

    @Column(name = "customer_event_id")
    private UUID eventId;

    @Column(name = "customer_loyality_points")
    private String loyalityPoints;

    @Column(name = "customer_checkIn_date")
    private Date checkInDate;

    @Column(name = "customer_checkIn_status")
    private String checkInStatus;

    @Column(name = "customer_checkOut_date")
    private Date checkOutDate;

    @Column(name = "customer_checkOut_status")
    private String checkOutStatus;

    @Column(name = "customer_total_amount")
    private int totalAmount;

    @Column(name = "customer_payment_method")
    private String paymentMethod;

    @Column(name = "customer_payment_id")
    private UUID paymentId;

    @Column(name = "customer_create")
    private Date customerTabCreate;

    @Column(name = "customer_update")
    private Date customerTabUpdate;

    public CommonCustomer() {
        this.customerId = UUID.randomUUID();
    }

    public CommonCustomer(String firstName, String lastName, String email, int phoneNumber, String address, UUID reservationId, String reservationHistory, int roomNumber, UUID serviceId, UUID eventId, String loyalityPoints, Date checkInDate, String checkInStatus, Date checkOutDate, String checkOutStatus, int totalAmount, String paymentMethod, UUID paymentId, Date customerTabCreate, Date customerTabUpdate) {
        this.customerId = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.reservationId = reservationId;
        this.reservationHistory = reservationHistory;
        this.roomNumber = roomNumber;
        this.serviceId = serviceId;
        this.eventId = eventId;
        this.loyalityPoints = loyalityPoints;
        this.checkInDate = checkInDate;
        this.checkInStatus = checkInStatus;
        this.checkOutDate = checkOutDate;
        this.checkOutStatus = checkOutStatus;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
        this.paymentId = paymentId;
        this.customerTabCreate = customerTabCreate;
        this.customerTabUpdate = customerTabUpdate;
    }

    @Override
    public UUID getCustomerId() {
        return customerId;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public UUID getReservationId() {
        return reservationId;
    }

    @Override
    public String getReservationHistory() {
        return reservationHistory;
    }

    @Override
    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public UUID getServiceId() {
        return serviceId;
    }

    @Override
    public UUID getEventId() {
        return eventId;
    }

    @Override
    public String getLoyalityPoints() {
        return loyalityPoints;
    }

    @Override
    public Date getCheckInDate() {
        return checkInDate;
    }

    @Override
    public String getCheckInStatus() {
        return checkInStatus;
    }

    @Override
    public Date getCheckOutDate() {
        return checkOutDate;
    }

    @Override
    public String getCheckOutStatus() {
        return checkOutStatus;
    }

    @Override
    public int getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public UUID getPaymentId() {
        return paymentId;
    }

    @Override
    public Date getCustomerTabCreate() {
        return customerTabCreate;
    }

    @Override
    public Date getCustomerTabUpdate() {
        return customerTabUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonCustomer that = (CommonCustomer) o;
        return phoneNumber == that.phoneNumber && roomNumber == that.roomNumber && totalAmount == that.totalAmount && Objects.equals(customerId, that.customerId) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(email, that.email) && Objects.equals(address, that.address) && Objects.equals(reservationId, that.reservationId) && Objects.equals(reservationHistory, that.reservationHistory) && Objects.equals(serviceId, that.serviceId) && Objects.equals(eventId, that.eventId) && Objects.equals(loyalityPoints, that.loyalityPoints) && Objects.equals(checkInDate, that.checkInDate) && Objects.equals(checkInStatus, that.checkInStatus) && Objects.equals(checkOutDate, that.checkOutDate) && Objects.equals(checkOutStatus, that.checkOutStatus) && Objects.equals(paymentMethod, that.paymentMethod) && Objects.equals(paymentId, that.paymentId) && Objects.equals(customerTabCreate, that.customerTabCreate) && Objects.equals(customerTabUpdate, that.customerTabUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, firstName, lastName, email, phoneNumber, address, reservationId, reservationHistory, roomNumber, serviceId, eventId, loyalityPoints, checkInDate, checkInStatus, checkOutDate, checkOutStatus, totalAmount, paymentMethod, paymentId, customerTabCreate, customerTabUpdate);
    }

    @Override
    public String toString() {
        return "CommonCustomer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", reservationId=" + reservationId +
                ", reservationHistory='" + reservationHistory + '\'' +
                ", roomNumber=" + roomNumber +
                ", serviceId=" + serviceId +
                ", eventId=" + eventId +
                ", loyalityPoints='" + loyalityPoints + '\'' +
                ", checkInDate=" + checkInDate +
                ", checkInStatus='" + checkInStatus + '\'' +
                ", checkOutDate=" + checkOutDate +
                ", checkOutStatus='" + checkOutStatus + '\'' +
                ", totalAmount=" + totalAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentId=" + paymentId +
                ", customerCreate=" + customerTabCreate +
                ", customerUpdate=" + customerTabUpdate +
                '}';
    }
}
