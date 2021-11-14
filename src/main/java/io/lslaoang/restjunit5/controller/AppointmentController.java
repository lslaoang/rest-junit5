package io.lslaoang.restjunit5.controller;

import io.lslaoang.restjunit5.domain.Appointment;
import io.lslaoang.restjunit5.repository.AppointmentRepository;
import io.lslaoang.restjunit5.repository.DoctorRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/appointment")
public class AppointmentController {

    @Autowired
    AppointmentRepository appointmentRepository;
    @Autowired
    DoctorRepository doctorRepository;

    @GetMapping
    public List<Appointment> getAllAppointment(){
        return  appointmentRepository.findAll();
    }

    @GetMapping(value = "/{appointmentId}")
    public Appointment getAppointmentById(@PathVariable Long appointmentID) throws NotFoundException {

        if(appointmentRepository.findById(appointmentID).isEmpty()) {
            throw new NotFoundException("Appointment " +appointmentID +" Not Found");
        }
        return appointmentRepository.findById(appointmentID).get();
     }


    @GetMapping(value = "/doctor/{doctorId}")
    public Appointment getAppointmentByDoctor(@PathVariable Long doctorId) throws NotFoundException {
        Appointment appointment = new Appointment();

        if(doctorRepository.findById(doctorId).isEmpty()) {
            throw new NotFoundException("Appointment " +doctorId +" Not Found");
        }
        if (doctorId == appointment.getDoctorInCharge().getDoctorId()){
            appointment =  appointmentRepository.findById(appointment.getAppointmentId()).get();
        }
        return appointment;
    }


}
