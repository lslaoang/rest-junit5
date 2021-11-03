package io.lslaoang.restjunit5.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@NoArgsConstructor
@AllArgsConstructor
public class DoctorInformation extends BaseEntity{
    @Id
    @Column(name = "doctor_id", nullable = false)
    @NonNull
    private Long doctorID;


}
