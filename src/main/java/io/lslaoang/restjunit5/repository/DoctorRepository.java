package io.lslaoang.restjunit5.repository;

import io.lslaoang.restjunit5.domain.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
