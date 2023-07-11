package com.practice.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.springboot.entity.Citizen;

public interface CitizenRepository extends JpaRepository<Citizen, Long> {
    List<Citizen> findByVaccineCenterId(Long vaccineCenterId);
}
