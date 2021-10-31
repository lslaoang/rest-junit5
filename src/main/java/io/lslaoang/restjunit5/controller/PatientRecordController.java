package io.lslaoang.restjunit5.controller;

import io.lslaoang.restjunit5.domain.PatientRecord;
import io.lslaoang.restjunit5.repository.PatientRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/patient")
public class PatientRecordController {

    @Autowired PatientRecordRepository patientRecordRepository;

    @GetMapping
    public List<PatientRecord> getAllPatient(){
        return patientRecordRepository.findAll();
    }

    @GetMapping(value = "{patientId}")
    public PatientRecord getPatientById(@PathVariable Long patientId){
        return patientRecordRepository.findById(patientId).get();
    }

    @PostMapping
    public PatientRecord createRecord(@RequestBody @Valid PatientRecord patientRecord){
        return patientRecordRepository.save(patientRecord);
    }

}
