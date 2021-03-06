package io.lslaoang.restjunit5.controller;

import io.lslaoang.restjunit5.domain.Doctor;
import io.lslaoang.restjunit5.repository.DoctorRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {

    @Autowired
    DoctorRepository doctorRepository;

    @GetMapping
    public List<Doctor> getDoctors(){
        return doctorRepository.findAll();
    }

    @GetMapping(value = "/{doctorId}")
    public Doctor getDoctorById(@PathVariable Long doctorId) throws NotFoundException{
        if(doctorRepository.findById(doctorId).isEmpty()) {
            throw new NotFoundException("Doctor " +doctorId +" Not Found");
        }
                return doctorRepository.findById(doctorId).get();
    }

    @DeleteMapping(value = "/{doctorId}")
    public void deleteDoctorById(@PathVariable("doctorId") Long doctorId) throws NotFoundException {
        if (doctorRepository.findById(doctorId).isEmpty()) {
            throw new NotFoundException("Doctor " + doctorId + " Not Found");
        }
        doctorRepository.deleteById(doctorId);
    }



}
