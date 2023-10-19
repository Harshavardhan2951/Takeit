package com.practice.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.practice.springboot.entity.Citizen;
import com.practice.springboot.service.CitizenService;
import java.util.List;

@RestController
@RequestMapping("/citizens")
public class CitizenController {

    private final CitizenService citizenService;

    @Autowired
    public CitizenController(CitizenService citizenService) {
        this.citizenService = citizenService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Citizen>> getAllCitizens() {
        List<Citizen> citizens = citizenService.getAllCitizens();
        return new ResponseEntity<>(citizens, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Citizen> getCitizenById(@PathVariable("id") Long id) {
        Citizen citizen = citizenService.getCitizenById(id);
        return new ResponseEntity<>(citizen, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Citizen> saveCitizen(@RequestBody Citizen citizen) {
        Citizen savedCitizen = citizenService.saveCitizen(citizen);
        return new ResponseEntity<>(savedCitizen, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCitizen(@PathVariable("id") Long id) {
        citizenService.deleteCitizen(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/center/{vaccineCenterId}")
    public ResponseEntity<List<Citizen>> getCitizensByVaccineCenterId(@PathVariable("vaccineCenterId") Long vaccineCenterId) {
        List<Citizen> citizens = citizenService.getCitizensByVaccineCenterId(vaccineCenterId);
        return new ResponseEntity<>(citizens, HttpStatus.OK);
    }
}

