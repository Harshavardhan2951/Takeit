package com.practice.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.practice.springboot.entity.VaccineCenter;
import com.practice.springboot.service.VaccineCenterService;
import java.util.List;

@RestController
@RequestMapping("/vaccinationcenter")
public class VaccineCenterController {

    private final VaccineCenterService vaccineCenterService;

    @Autowired
    public VaccineCenterController(VaccineCenterService vaccineCenterService) {
        this.vaccineCenterService = vaccineCenterService;
    }

    @GetMapping("/")
    public ResponseEntity<List<VaccineCenter>> getAllVaccineCenters() {
        List<VaccineCenter> vaccineCenters = vaccineCenterService.getAllVaccineCenters();
        return new ResponseEntity<>(vaccineCenters, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VaccineCenter> getVaccineCenterById(@PathVariable("id") Long id) {
        VaccineCenter vaccineCenter = vaccineCenterService.getVaccineCenterById(id);
        return new ResponseEntity<>(vaccineCenter, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<VaccineCenter> saveVaccineCenter(@RequestBody VaccineCenter vaccineCenter) {
        VaccineCenter savedVaccineCenter = vaccineCenterService.saveVaccineCenter(vaccineCenter);
        return new ResponseEntity<>(savedVaccineCenter, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVaccineCenter(@PathVariable("id") Long id) {
        vaccineCenterService.deleteVaccineCenter(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

