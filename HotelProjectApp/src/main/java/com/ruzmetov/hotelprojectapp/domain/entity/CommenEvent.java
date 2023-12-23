package com.ruzmetov.hotelprojectapp.domain.entity;

import com.ruzmetov.hotelprojectapp.domain.interfaces.Event;
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

public class CommenEvent implements Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private UUID eventId;

    @Column(name = "event_name")
    private String eventName;

    @Column(name = "event_description")
    private String eventDescription;

    @Column(name = "event_date")
    private Date date;

    @Column(name = "event_time_beginning")
    private Date eventTimeBeginning;

    @Column(name = "event_time_end")
    private Date eventTimeEnd;

    @Column(name = "event_location")
    private String location;

    @Column(name = "event_capasity")
    private int capacity;

    @Column(name = "event_organized_company")
    private String organizedCompanyName;

    @Column(name = "event_contact_person")
    private String contactPersonName;

    @Column(name = "event_category")
    private String eventCategory;

    @Column(name = "event_total_price")
    private double totalPrice;

    @Column(name = "event_payment_method")
    private String paymentMethod;

    @Column(name = "event_payment_id")
    private UUID paymentId;

    @Column(name = "event_employee_id")
    private UUID employeeId;

    @Column(name = "event_administrator_id")
    private String administratorId;

    @Column(name = "event_create")
    private Date eventTabCreate;

    @Column(name = "event_update")
    private Date eventTabUpdate;

    public CommenEvent() {
        this.eventId = UUID.randomUUID();
    }


    public CommenEvent(String eventName, String eventDescription, Date date, Date eventTimeBeginning, Date eventTimeEnd, String location, int capacity, String organizedCompanyName, String contactPersonName, String eventCategory, double totalPrice, String paymentMethod, UUID paymentId, UUID employeeId, String administratorId, Date eventTabCreate, Date eventTabUpdate) {
        this.eventId = UUID.randomUUID();
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.date = date;
        this.eventTimeBeginning = eventTimeBeginning;
        this.eventTimeEnd = eventTimeEnd;
        this.location = location;
        this.capacity = capacity;
        this.organizedCompanyName = organizedCompanyName;
        this.contactPersonName = contactPersonName;
        this.eventCategory = eventCategory;
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
        this.paymentId = paymentId;
        this.employeeId = employeeId;
        this.administratorId = administratorId;
        this.eventTabCreate = eventTabCreate;
        this.eventTabUpdate = eventTabUpdate;
    }


    @Override
    public UUID getEventId() {
        return eventId;
    }

    @Override
    public String getEventName() {
        return eventName;
    }

    @Override
    public String getEventDescription() {
        return eventDescription;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public Date getEventTimeBeginning() {
        return eventTimeBeginning;
    }

    @Override
    public Date getEventTimeEnd() {
        return eventTimeEnd;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String getOrganizedCompanyName() {
        return organizedCompanyName;
    }

    @Override
    public String getContactPersonName() {
        return contactPersonName;
    }

    @Override
    public String getEventCategory() {
        return eventCategory;
    }

    @Override
    public double getTotalPrice() {
        return totalPrice;
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
    public UUID getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getAdministratorId() {
        return administratorId;
    }

    @Override
    public Date getEventTabCreate() {
        return eventTabCreate;
    }

    @Override
    public Date getEventTabUpdate() {
        return eventTabUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommenEvent that = (CommenEvent) o;
        return capacity == that.capacity && Double.compare(totalPrice, that.totalPrice) == 0 && Objects.equals(eventId, that.eventId) && Objects.equals(eventName, that.eventName) && Objects.equals(eventDescription, that.eventDescription) && Objects.equals(date, that.date) && Objects.equals(eventTimeBeginning, that.eventTimeBeginning) && Objects.equals(eventTimeEnd, that.eventTimeEnd) && Objects.equals(location, that.location) && Objects.equals(organizedCompanyName, that.organizedCompanyName) && Objects.equals(contactPersonName, that.contactPersonName) && Objects.equals(eventCategory, that.eventCategory) && Objects.equals(paymentMethod, that.paymentMethod) && Objects.equals(paymentId, that.paymentId) && Objects.equals(employeeId, that.employeeId) && Objects.equals(administratorId, that.administratorId) && Objects.equals(eventTabCreate, that.eventTabCreate) && Objects.equals(eventTabUpdate, that.eventTabUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, eventName, eventDescription, date, eventTimeBeginning, eventTimeEnd, location, capacity, organizedCompanyName, contactPersonName, eventCategory, totalPrice, paymentMethod, paymentId, employeeId, administratorId, eventTabCreate, eventTabUpdate);
    }

    @Override
    public String toString() {
        return "CommenEvent{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", eventDescription='" + eventDescription + '\'' +
                ", date=" + date +
                ", eventTimeBeginning=" + eventTimeBeginning +
                ", eventTimeEnd=" + eventTimeEnd +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                ", organizedCompanyName='" + organizedCompanyName + '\'' +
                ", contactPersonName='" + contactPersonName + '\'' +
                ", eventCategory='" + eventCategory + '\'' +
                ", totalPrice=" + totalPrice +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentId=" + paymentId +
                ", employeeId=" + employeeId +
                ", administratorId='" + administratorId + '\'' +
                ", eventTabCreate=" + eventTabCreate +
                ", eventTabUpdate=" + eventTabUpdate +
                '}';
    }
}
