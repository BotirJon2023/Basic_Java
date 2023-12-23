package com.ruzmetov.hotelprojectapp.domain.entity;

import com.ruzmetov.hotelprojectapp.domain.interfaces.Payment;
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

public class CommonPayment implements Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private UUID paymentId;

    @Column(name = "payment_room_number")
    private int roomNumber;

    @Column(name = "payment_service_id")
    private UUID serviceId;

    @Column(name = "payment_event_id")
    private UUID eventId;

    @Column(name = "payment_customer_first_name")
    private String customerFirstName;

    @Column(name = "payment_customer_last_name")
    private String customerLastName;

    @Column(name = "payment_credit_card_number")
    private int creditCardNumber;

    @Column(name = "payment_credit_card_expiring_date")
    private Date creditCardExpiringDate;

    @Column(name = "payment_credit_card_CVV")
    private int creditCardCVV;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "payment_total_amount")
    private double totalAmount;

    @Column(name = "payment_transaction_id")
    private UUID transactionId;

    @Column(name = "payment_transaction_history")
    private String transactionHistory;

    @Column(name = "payment_employee_id")
    private UUID employeeId;

    @Column(name = "payment_administrator_id")
    private UUID administratorId;

    @Column(name = "payment_create")
    private Date paymentTabCreate;

    @Column(name = "payment_update")
    private Date paymentTabUpdate;

    public CommonPayment() {
        this.paymentId = UUID.randomUUID();
    }

    public CommonPayment(int roomNumber, UUID serviceId, UUID eventId, String customerFirstName, String customerLastName, int creditCardNumber, Date creditCardExpiringDate, int creditCardCVV, String paymentMethod, double totalAmount, UUID transactionId, String transactionHistory, UUID employeeId, UUID administratorId, Date paymentTabCreate, Date paymentTabUpdate) {
        this.paymentId = UUID.randomUUID();
        this.roomNumber = roomNumber;
        this.serviceId = serviceId;
        this.eventId = eventId;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.creditCardNumber = creditCardNumber;
        this.creditCardExpiringDate = creditCardExpiringDate;
        this.creditCardCVV = creditCardCVV;
        this.paymentMethod = paymentMethod;
        this.totalAmount = totalAmount;
        this.transactionId = transactionId;
        this.transactionHistory = transactionHistory;
        this.employeeId = employeeId;
        this.administratorId = administratorId;
        this.paymentTabCreate = paymentTabCreate;
        this.paymentTabUpdate = paymentTabUpdate;
    }

    @Override
    public UUID getPaymentId() {
        return paymentId;
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
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    @Override
    public String getCustomerLastName() {
        return customerLastName;
    }

    @Override
    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    @Override
    public Date getCreditCardExpiringDate() {
        return creditCardExpiringDate;
    }

    @Override
    public int getCreditCardCVV() {
        return creditCardCVV;
    }

    @Override
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public UUID getTransactionId() {
        return transactionId;
    }

    @Override
    public String getTransactionHistory() {
        return transactionHistory;
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
    public Date getPaymentTabCreate() {
        return paymentTabCreate;
    }

    @Override
    public Date getPaymentTabUpdate() {
        return paymentTabUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonPayment that = (CommonPayment) o;
        return roomNumber == that.roomNumber && creditCardNumber == that.creditCardNumber && creditCardCVV == that.creditCardCVV && Double.compare(totalAmount, that.totalAmount) == 0 && Objects.equals(paymentId, that.paymentId) && Objects.equals(serviceId, that.serviceId) && Objects.equals(eventId, that.eventId) && Objects.equals(customerFirstName, that.customerFirstName) && Objects.equals(customerLastName, that.customerLastName) && Objects.equals(creditCardExpiringDate, that.creditCardExpiringDate) && Objects.equals(paymentMethod, that.paymentMethod) && Objects.equals(transactionId, that.transactionId) && Objects.equals(transactionHistory, that.transactionHistory) && Objects.equals(employeeId, that.employeeId) && Objects.equals(administratorId, that.administratorId) && Objects.equals(paymentTabCreate, that.paymentTabCreate) && Objects.equals(paymentTabUpdate, that.paymentTabUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentId, roomNumber, serviceId, eventId, customerFirstName, customerLastName, creditCardNumber, creditCardExpiringDate, creditCardCVV, paymentMethod, totalAmount, transactionId, transactionHistory, employeeId, administratorId, paymentTabCreate, paymentTabUpdate);
    }

    @Override
    public String toString() {
        return "CommonPayment{" +
                "paymentId=" + paymentId +
                ", roomNumber=" + roomNumber +
                ", serviceId=" + serviceId +
                ", eventId=" + eventId +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", creditCardExpiringDate=" + creditCardExpiringDate +
                ", creditCardCVV=" + creditCardCVV +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", totalAmount=" + totalAmount +
                ", transactionId=" + transactionId +
                ", transactionHistory='" + transactionHistory + '\'' +
                ", employeeId=" + employeeId +
                ", administratorId=" + administratorId +
                ", paymentTabCreate=" + paymentTabCreate +
                ", paymentTabUpdate=" + paymentTabUpdate +
                '}';
    }
}
