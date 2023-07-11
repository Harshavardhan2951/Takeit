package com.practice.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "citizens")
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String city;
    private int no_of_doses;
    private String vaccinationCenter;
    private String vaccinationStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vaccine_center_id")
    private VaccineCenter vaccineCenter;

	public Citizen(Long id, String name, String city, int no_of_doses, String vaccinationCenter,
			String vaccinationStatus, VaccineCenter vaccineCenter) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.no_of_doses = no_of_doses;
		this.vaccinationCenter = vaccinationCenter;
		this.vaccinationStatus = vaccinationStatus;
		this.vaccineCenter = vaccineCenter;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getNo_of_doses() {
		return no_of_doses;
	}

	public void setNo_of_doses(int no_of_doses) {
		this.no_of_doses = no_of_doses;
	}

	public String getVaccinationCenter() {
		return vaccinationCenter;
	}

	public void setVaccinationCenter(String vaccinationCenter) {
		this.vaccinationCenter = vaccinationCenter;
	}

	public String getVaccinationStatus() {
		return vaccinationStatus;
	}

	public void setVaccinationStatus(String vaccinationStatus) {
		this.vaccinationStatus = vaccinationStatus;
	}

	public VaccineCenter getVaccineCenter() {
		return vaccineCenter;
	}

	public void setVaccineCenter(VaccineCenter vaccineCenter) {
		this.vaccineCenter = vaccineCenter;
	}

    // Constructors, getters, and setters
}

