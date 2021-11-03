package io.lslaoang.restjunit5.domain;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {

    @Id
    private Long doctorId;
    private String doctorName;
    private Integer doctorAge;
    private String  doctorAddress;

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Integer getDoctorAge() {
        return doctorAge;
    }

    public void setDoctorAge(Integer doctorAge) {
        this.doctorAge = doctorAge;
    }

    public String getDoctorAddress() {
        return doctorAddress;
    }

    public void setDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }

    public Doctor(Long doctorId, String doctorName, Integer doctorAge, String doctorAddress) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.doctorAge = doctorAge;
        this.doctorAddress = doctorAddress;
    }

    public Doctor(){}
}
