package com.dan.repository;

import com.dan.entity.Practitioner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PractitionerRepository extends JpaRepository<Practitioner, Long> {
  Practitioner findByLastName(String lastName);
}