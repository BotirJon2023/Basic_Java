package com.ruzmetov.hotelprojectapp.domain.entity;

import com.ruzmetov.hotelprojectapp.domain.interfaces.Employee;
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
@AllArgsConstructor
@Table
@Entity


public class CommenEmployee implements Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private UUID employeeId;

    @Column(name = "employee_first_name")
    private String firstName;

    @Column(name = "employee_last_name")
    private String lastName;

    @Column(name = "employee_departament")
    private String departament;

    @Column(name = "employee_position")
    private String employeePosition;

    @Column(name = "employee_shift_start_time")
    private Date shiftStartTime;

    @Column(name = "employee_shift_start_time")
    private Date shiftEndTime;

    @Column(name = "employee_feedback")
    private String feedback;

    @Column(name = "employee_complains")
    private String complains;

    @Column(name = "employee_create")
    private Date employeeTabCreate;

    @Column(name = "employee_update")
    private Date employeeTabUpdate;

    public CommenEmployee() {
        this.employeeId = UUID.randomUUID();
    }

    public CommenEmployee(String firstName, String lastName, String departament, String employeePosition, Date shiftStartTime, Date shiftEndTime, String feedback, String complains, Date employeeTabCreate, Date employeeTabUpdate) {
        this.employeeId = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.departament = departament;
        this.employeePosition = employeePosition;
        this.shiftStartTime = shiftStartTime;
        this.shiftEndTime = shiftEndTime;
        this.feedback = feedback;
        this.complains = complains;
        this.employeeTabCreate = employeeTabCreate;
        this.employeeTabUpdate = employeeTabUpdate;
    }

    @Override
    public UUID getEmployeeId() {
        return employeeId;
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
    public String getDepartament() {
        return departament;
    }

    @Override
    public String getEmployeePosition() {
        return employeePosition;
    }

    @Override
    public Date getShiftStartTime() {
        return shiftStartTime;
    }

    @Override
    public Date getShiftEndTime() {
        return shiftEndTime;
    }

    @Override
    public String getFeedback() {
        return feedback;
    }

    @Override
    public String getComplains() {
        return complains;
    }

    @Override
    public Date getEmployeeTabCreate() {
        return employeeTabCreate;
    }

    @Override
    public Date getEmployeeTabUpdate() {
        return employeeTabUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommenEmployee that = (CommenEmployee) o;
        return Objects.equals(employeeId, that.employeeId) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(departament, that.departament) && Objects.equals(employeePosition, that.employeePosition) && Objects.equals(shiftStartTime, that.shiftStartTime) && Objects.equals(shiftEndTime, that.shiftEndTime) && Objects.equals(feedback, that.feedback) && Objects.equals(complains, that.complains) && Objects.equals(employeeTabCreate, that.employeeTabCreate) && Objects.equals(employeeTabUpdate, that.employeeTabUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, firstName, lastName, departament, employeePosition, shiftStartTime, shiftEndTime, feedback, complains, employeeTabCreate, employeeTabUpdate);
    }

    @Override
    public String toString() {
        return "CommenEmployee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departament='" + departament + '\'' +
                ", employeePosition='" + employeePosition + '\'' +
                ", shiftStartTime=" + shiftStartTime +
                ", shiftEndTime=" + shiftEndTime +
                ", feedback='" + feedback + '\'' +
                ", complains='" + complains + '\'' +
                ", employeeTabCreate=" + employeeTabCreate +
                ", employeeTabUpdate=" + employeeTabUpdate +
                '}';
    }
}



