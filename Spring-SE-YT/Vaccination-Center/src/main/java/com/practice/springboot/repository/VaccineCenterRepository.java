package com.practice.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.practice.springboot.entity.VaccineCenter;

@Repository
public interface VaccineCenterRepository extends JpaRepository<VaccineCenter, Long> {
}
