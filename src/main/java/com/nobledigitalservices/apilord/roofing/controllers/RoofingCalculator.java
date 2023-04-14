package com.nobledigitalservices.apilord.roofing.controllers;

import com.nobledigitalservices.apilord.roofing.model.Measurements;
import com.nobledigitalservices.apilord.roofing.repository.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoofingCalculator {

    @Autowired
    MeasurementRepository measureableRepo;

    @PostMapping
    public void saveCalculations(){

    }

    @GetMapping(value = "/all")
    public List<Measurements> getAllMeasurements(){
        List<Measurements> measurements = measureableRepo.findAll();
        return  measurements;
    }
}
