package io.lslaoang.restjunit5.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Appointment {

    @Id
    Long appointmentId;

    @OneToOne
    @JoinColumn(name = "doctor_in_charge_doctor_id")
    Doctor doctorInCharge;

    @OneToMany
    List<PatientRecord> patientRecordList;
    LocalDate appointmentTime;
    String location;

    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Doctor getDoctorInCharge() {
        return doctorInCharge;
    }

    public void setDoctorInCharge(Doctor doctorInCharge) {
        this.doctorInCharge = doctorInCharge;
    }

    public List<PatientRecord> getPatientRecordList() {
        return patientRecordList;
    }

    public void setPatientRecordList(List<PatientRecord> patientRecordList) {
        this.patientRecordList = patientRecordList;
    }

    public LocalDate getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalDate appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
