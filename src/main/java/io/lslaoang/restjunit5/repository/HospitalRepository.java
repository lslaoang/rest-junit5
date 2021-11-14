package io.lslaoang.restjunit5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

//Annotation to help ComponentScanner classify this interface as non-bean
@NoRepositoryBean
public interface HospitalRepository<Object, Long> extends JpaRepository <Object, Long>{
}
