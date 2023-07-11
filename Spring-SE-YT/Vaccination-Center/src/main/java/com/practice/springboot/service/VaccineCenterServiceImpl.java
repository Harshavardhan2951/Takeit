package com.practice.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.springboot.entity.VaccineCenter;

import com.practice.springboot.repository.VaccineCenterRepository;

import java.util.List;
import java.util.Optional;

@Service
public class VaccineCenterServiceImpl implements VaccineCenterService {

    private final VaccineCenterRepository vaccineCenterRepository;

    @Autowired
    public VaccineCenterServiceImpl(VaccineCenterRepository vaccineCenterRepository) {
        this.vaccineCenterRepository = vaccineCenterRepository;
    }

    @Override
    public List<VaccineCenter> getAllVaccineCenters() {
        return vaccineCenterRepository.findAll();
    }

    @Override
    public VaccineCenter getVaccineCenterById(Long id) {
        Optional<VaccineCenter> vaccineCenterOptional = vaccineCenterRepository.findById(id);
        
        if (vaccineCenterOptional.isPresent()) {
            return vaccineCenterOptional.get();
        } else {
            throw new com.practice.springboot.controller.NotFoundException("Vaccine Center not found with ID: " + id);
        }
    }

    @Override
    public VaccineCenter saveVaccineCenter(VaccineCenter vaccineCenter) {
        return vaccineCenterRepository.save(vaccineCenter);
    }

    @Override
    public void deleteVaccineCenter(Long id) {
        vaccineCenterRepository.deleteById(id);
    }
}
