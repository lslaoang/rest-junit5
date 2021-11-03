package io.lslaoang.restjunit5.bootstrap;

import io.lslaoang.restjunit5.domain.Doctor;
import io.lslaoang.restjunit5.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public void run(String... args) throws Exception {
        Doctor doctor = new Doctor();

        doctor.setDoctorId(001L);
        doctor.setName("Laurel L");
        doctor.setAge(47);
        doctor.setAddress("Makati, Philippines");

        doctorRepository.save(doctor);

        System.out.println("Doctor persisted");
    }
}
