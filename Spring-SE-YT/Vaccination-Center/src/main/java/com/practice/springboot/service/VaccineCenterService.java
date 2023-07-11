package com.practice.springboot.service;

import java.util.List;

import com.practice.springboot.entity.VaccineCenter;

public interface VaccineCenterService {

    List<VaccineCenter> getAllVaccineCenters();

    VaccineCenter getVaccineCenterById(Long id);

    VaccineCenter saveVaccineCenter(VaccineCenter vaccineCenter);

    void deleteVaccineCenter(Long id);
}

