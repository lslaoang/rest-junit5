package io.lslaoang.restjunit5.domain;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor extends BaseEntity{

    @Id
    private Long doctorId;

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

}
