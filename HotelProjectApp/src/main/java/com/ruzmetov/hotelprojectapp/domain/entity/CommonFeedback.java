package com.ruzmetov.hotelprojectapp.domain.entity;

import com.ruzmetov.hotelprojectapp.domain.interfaces.Feedback;
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

public class CommonFeedback implements Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feedback_id")
    private UUID feedbackId;

    @Column(name = "feedback_room_number")
    private int roomNumber;

    @Column(name = "feedback_service_id")
    private UUID serviceId;

    @Column(name = "feedback_event_id")
    private UUID eventId;

    @Column(name = "feedback_satisfaction_rating_from_1_to_5")
    private int satisfactionRating;

    @Column(name = "feedback_comments")
    private String comments;

    @Column(name = "feedback_customer_first_name")
    private String customerFirstName;

    @Column(name = "feedback_customer_last_name")
    private String customerLastName;

    @Column(name = "feedback_access_administrator_id")
    private UUID accessAdministratorId;

    @Column(name = "feedback_create")
    private Date feedbackTabCreate;

    @Column(name = "feedback_update")
    private Date feedbackTabUpdate;


    public CommonFeedback() {
        this.feedbackId = UUID.randomUUID();
    }

    public CommonFeedback(int roomNumber, UUID serviceId, UUID eventId, int satisfactionRating, String comments, String customerFirstName, String customerLastName, UUID accessAdministratorId, Date feedbackTabCreate, Date feedbackTabUpdate) {
        this.feedbackId = UUID.randomUUID();
        this.roomNumber = roomNumber;
        this.serviceId = serviceId;
        this.eventId = eventId;
        this.satisfactionRating = satisfactionRating;
        this.comments = comments;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.accessAdministratorId = accessAdministratorId;
        this.feedbackTabCreate = feedbackTabCreate;
        this.feedbackTabUpdate = feedbackTabUpdate;
    }

    @Override
    public UUID getFeedbackId() {
        return feedbackId;
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
    public int getSatisfactionRating() {
        return satisfactionRating;
    }

    @Override
    public String getComments() {
        return comments;
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
    public UUID getAccessAdministratorId() {
        return accessAdministratorId;
    }

    @Override
    public Date getFeedbackTabCreate() {
        return feedbackTabCreate;
    }

    @Override
    public Date getFeedbackTabUpdate() {
        return feedbackTabUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonFeedback that = (CommonFeedback) o;
        return roomNumber == that.roomNumber && satisfactionRating == that.satisfactionRating && Objects.equals(feedbackId, that.feedbackId) && Objects.equals(serviceId, that.serviceId) && Objects.equals(eventId, that.eventId) && Objects.equals(comments, that.comments) && Objects.equals(customerFirstName, that.customerFirstName) && Objects.equals(customerLastName, that.customerLastName) && Objects.equals(accessAdministratorId, that.accessAdministratorId) && Objects.equals(feedbackTabCreate, that.feedbackTabCreate) && Objects.equals(feedbackTabUpdate, that.feedbackTabUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedbackId, roomNumber, serviceId, eventId, satisfactionRating, comments, customerFirstName, customerLastName, accessAdministratorId, feedbackTabCreate, feedbackTabUpdate);
    }

    @Override
    public String toString() {
        return "CommonFeedback{" +
                "feedbackId=" + feedbackId +
                ", roomNumber=" + roomNumber +
                ", serviceId=" + serviceId +
                ", eventId=" + eventId +
                ", satisfactionRating=" + satisfactionRating +
                ", comments='" + comments + '\'' +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", accessAdministratorId=" + accessAdministratorId +
                ", feedbackTabCreate=" + feedbackTabCreate +
                ", feedbackTabUpdate=" + feedbackTabUpdate +
                '}';
    }
}
