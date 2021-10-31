package io.lslaoang.restjunit5.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PatienRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long patientId;
}
