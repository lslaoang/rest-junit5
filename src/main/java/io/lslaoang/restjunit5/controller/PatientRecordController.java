package io.lslaoang.restjunit5.controller;

import io.lslaoang.restjunit5.domain.PatientRecord;
import io.lslaoang.restjunit5.repository.PatientRecordRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

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
        //Validation
        if(patientRecord == null || patientRecord.getPatientId()==null){
            throw new InvalidRequestException("Patient Record or Patient ID must not be null!");
        }else{
            return patientRecordRepository.save(patientRecord);
        }
    }

    @PutMapping
    public PatientRecord updatePatientRecord(@RequestBody PatientRecord patientRecord) throws NotFoundException {

        //Validation
        if(patientRecord == null || patientRecord.getPatientId()==null){
            throw new InvalidRequestException("Patient Record or Patient ID must not be null!");
        }
        Optional<PatientRecord> optionalPatientRecord = patientRecordRepository.findById(patientRecord.getPatientId());
        if(optionalPatientRecord.isEmpty() || !optionalPatientRecord.isPresent()){
            throw new NotFoundException("Patient with ID " + patientRecord.getPatientId() + " does not exist.");
        }
        else {
            PatientRecord existingPatientRecord = optionalPatientRecord.get();
            existingPatientRecord.setName(patientRecord.getName());
            existingPatientRecord.setAddress(patientRecord.getAddress());
            existingPatientRecord.setAge(patientRecord.getAge());

            return patientRecordRepository.save(existingPatientRecord);
        }

    }

    @DeleteMapping(value = "{patientId}")
    public void deleteByPatientId(@PathVariable("patientId") Long patientId) throws NotFoundException{
        //Validation
        if(patientRecordRepository.findById(patientId).isEmpty()){
            throw new NotFoundException("Patient ID "+patientId +" does not exist.");
        }
        patientRecordRepository.deleteById(patientId);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public class InvalidRequestException extends RuntimeException {
        public InvalidRequestException(String s) {
            super(s);
        }
    }

}
