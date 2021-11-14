package io.lslaoang.restjunit5.controller;

import io.lslaoang.restjunit5.domain.Appointment;
import io.lslaoang.restjunit5.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/appointment")
public class AppointmentController {

    @Autowired
    AppointmentRepository appointmentRepository;

    @GetMapping("/{doctorId}")
    public Appointment getAppointment(@PathVariable("doctorId") Long docID){
      return appointmentRepository.findById(docID).get();
    }

}
