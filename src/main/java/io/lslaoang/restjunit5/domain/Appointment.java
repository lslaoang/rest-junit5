package io.lslaoang.restjunit5.domain;

import java.time.LocalDate;
import java.util.List;

public class Appointment {

    Doctor doctorInCharge;
    List<PatientRecord> patientRecordList;
    LocalDate appointmentTime;
    String location;

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
