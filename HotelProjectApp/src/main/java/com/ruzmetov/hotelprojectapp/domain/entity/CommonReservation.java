package com.ruzmetov.hotelprojectapp.domain.entity;

import com.ruzmetov.hotelprojectapp.domain.interfaces.Reservation;
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

public class CommonReservation implements Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private UUID reservationId;

    @Column(name = "reservation_customer_first_name")
    private String customerFirstName;

    @Column(name = "reservation_customer_last_name")
    private String customerLastName;

    @Column(name = "reservation_room_number")
    private int roomNumber;

    @Column(name = "reservation_event_id")
    private UUID eventId;

    @Column(name = "reservation_service_id")
    private UUID serviceId;

    @Column(name = "reservation_total_amount")
    private double totalAmount;

    @Column(name = "reservation_payment_method")
    private String paymentMethod;

    @Column(name = "reservation_payment_id")
    private UUID paymentId;

    @Column(name = "reservation_cancelled_info")
    private String cancellationInfo;

    @Column(name = "reservation_create")
    private Date reservationCreate;

    @Column(name = "reservation_update")
    private Date reservationUpdate;

    @Column(name = "reservation_employee_id")
    private UUID employeeId;

    @Column(name = "reservation_administrator_id")
    private UUID administratorId;

    public CommonReservation() {
        this.reservationId = UUID.randomUUID();
    }

    public CommonReservation(String customerFirstName, String customerLastName, int roomNumber, UUID eventId, UUID serviceId, double totalAmount, String paymentMethod, UUID paymentId, String cancellationInfo, Date reservationCreate, Date reservationUpdate, UUID employeeId, UUID administratorId) {
        this.reservationId = UUID.randomUUID();
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.roomNumber = roomNumber;
        this.eventId = eventId;
        this.serviceId = serviceId;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
        this.paymentId = paymentId;
        this.cancellationInfo = cancellationInfo;
        this.reservationCreate = reservationCreate;
        this.reservationUpdate = reservationUpdate;
        this.employeeId = employeeId;
        this.administratorId = administratorId;
    }

    @Override
    public UUID getReservationId() {
        return reservationId;
    }

    @Override
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    @Override
    public String getCustomerLastName() {
        return customerLastName;
    }

    @Override
    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public UUID getEventId() {
        return eventId;
    }

    @Override
    public UUID getServiceId() {
        return serviceId;
    }

    @Override
    public double getTotalAmount() {
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
    public String getCancellationInfo() {
        return cancellationInfo;
    }

    @Override
    public Date getReservationCreate() {
        return reservationCreate;
    }

    @Override
    public Date getReservationUpdate() {
        return reservationUpdate;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonReservation that = (CommonReservation) o;
        return roomNumber == that.roomNumber && Double.compare(totalAmount, that.totalAmount) == 0 && Objects.equals(reservationId, that.reservationId) && Objects.equals(customerFirstName, that.customerFirstName) && Objects.equals(customerLastName, that.customerLastName) && Objects.equals(eventId, that.eventId) && Objects.equals(serviceId, that.serviceId) && Objects.equals(paymentMethod, that.paymentMethod) && Objects.equals(paymentId, that.paymentId) && Objects.equals(cancellationInfo, that.cancellationInfo) && Objects.equals(reservationCreate, that.reservationCreate) && Objects.equals(reservationUpdate, that.reservationUpdate) && Objects.equals(employeeId, that.employeeId) && Objects.equals(administratorId, that.administratorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reservationId, customerFirstName, customerLastName, roomNumber, eventId, serviceId, totalAmount, paymentMethod, paymentId, cancellationInfo, reservationCreate, reservationUpdate, employeeId, administratorId);
    }

    @Override
    public String toString() {
        return "CommonReservation{" +
                "reservationId=" + reservationId +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", roomNumber=" + roomNumber +
                ", eventId=" + eventId +
                ", serviceId=" + serviceId +
                ", totalAmount=" + totalAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentId=" + paymentId +
                ", cancellationInfo='" + cancellationInfo + '\'' +
                ", reservationCreate=" + reservationCreate +
                ", reservationUpdate=" + reservationUpdate +
                ", employeeId=" + employeeId +
                ", administratorId=" + administratorId +
                '}';
    }
}
