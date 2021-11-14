package io.lslaoang.restjunit5.repository;

import io.lslaoang.restjunit5.domain.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
