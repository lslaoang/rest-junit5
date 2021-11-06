package io.lslaoang.restjunit5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PersonRepository<Object, Long> extends JpaRepository <Object, Long>{
}
