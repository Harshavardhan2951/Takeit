package com.practice.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practice.springboot.controller.NotFoundException;
import com.practice.springboot.entity.Citizen;
import com.practice.springboot.repository.CitizenRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CitizenServiceImpl implements CitizenService {

    private final CitizenRepository citizenRepository;

    @Autowired
    public CitizenServiceImpl(CitizenRepository citizenRepository) {
        this.citizenRepository = citizenRepository;
    }

    @Override
    public List<Citizen> getAllCitizens() {
        return citizenRepository.findAll();
    }

    @Override
    public Citizen getCitizenById(Long id) {
        Optional<Citizen> citizenOptional = citizenRepository.findById(id);
        if (citizenOptional.isPresent()) {
            return citizenOptional.get();
        } else {
            throw new NotFoundException("Citizen not found with ID: " + id);
        }
    }



    @Override
    public Citizen saveCitizen(Citizen citizen) {
        return citizenRepository.save(citizen);
    }

    @Override
    public void deleteCitizen(Long id) {
        citizenRepository.deleteById(id);
    }

    @Override
    public List<Citizen> getCitizensByVaccineCenterId(Long vaccineCenterId) {
        return citizenRepository.findByVaccineCenterId(vaccineCenterId);
    }
}
