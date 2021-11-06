package io.lslaoang.restjunit5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository<T, L extends Number> extends JpaRepository<Object,Long> {
}
