package io.lslaoang.restjunit5.bootstrap;

import io.lslaoang.restjunit5.domain.Appointment;
import io.lslaoang.restjunit5.domain.Doctor;
import io.lslaoang.restjunit5.domain.PatientRecord;
import io.lslaoang.restjunit5.repository.AppointmentRepository;
import io.lslaoang.restjunit5.repository.DoctorRepository;
import io.lslaoang.restjunit5.repository.PatientRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    PatientRecordRepository patientRecordRepository;
    @Autowired
    AppointmentRepository appointmentRepository;

    @Override
    public void run(String... args) throws Exception {
        Doctor doctor = new Doctor();
        doctor.setDoctorId(001L);
        doctor.setDoctorName("Laurel L");
        doctor.setDoctorAge(47);
        doctor.setDoctorAddress("Makati, Philippines");

        doctorRepository.save(doctor);
        System.out.println("Doctor persisted");

        Doctor surgeon = new Doctor();
        surgeon.setDoctorId(002L);
        surgeon.setDoctorName("Laoang L");
        surgeon.setDoctorAge(23);
        surgeon.setDoctorAddress("New York, USA");

        doctorRepository.save(surgeon);
        System.out.println("Surgeon persisted");

        PatientRecord patientRecord = new PatientRecord();
        patientRecord.setPatientId(1001L);
        patientRecord.setName("Mark Sam");
        patientRecord.setAge(28);
        patientRecord.setAddress("Mindoro");

        patientRecordRepository.save(patientRecord);
        System.out.println("Patient persisted");




        Appointment appointment = new Appointment();
        appointment.setAppointmentId(501L);
        appointment.setDoctorInCharge(doctorRepository.getById(001L));
        appointment.setPatientRecordList(Arrays.asList(patientRecord));
        appointment.setLocation("Makati");
        appointment.setAppointmentTime(LocalDate.now());

        appointmentRepository.save(appointment);
        System.out.println("Appointment persisted");

    }
}
