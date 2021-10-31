package io.lslaoang.restjunit5.repository;

import io.lslaoang.restjunit5.domain.PatientRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRecordRepository extends JpaRepository<PatientRecord, Long> {
}
