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

    public Doctor getDoctorInCharge() {
        return doctorInCharge;
    }

}
