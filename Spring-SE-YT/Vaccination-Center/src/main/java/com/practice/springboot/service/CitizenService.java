package com.practice.springboot.service;

import java.util.List;

import com.practice.springboot.entity.Citizen;

public interface CitizenService {

    List<Citizen> getAllCitizens();

    Citizen getCitizenById(Long id);

    Citizen saveCitizen(Citizen citizen);

    void deleteCitizen(Long id);

    List<Citizen> getCitizensByVaccineCenterId(Long vaccineCenterId);
}

