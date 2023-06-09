package com.nobledigitalservices.apilord.roofing.controllers;

import com.nobledigitalservices.apilord.roofing.model.UserRoofData;
import com.nobledigitalservices.apilord.roofing.repository.UserRoofDataRepository;
import com.nobledigitalservices.apilord.roofing.services.UserRoofDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RoofingCalculator {

    @Autowired
    UserRoofDataRepository userRoofDataRepo;

    @Autowired
    public UserRoofDataService userRoofDataService;

    @PostMapping
    public void saveCalculations(){

    }

    @GetMapping(value = "/all")
    public List<UserRoofData> getAllMeasurements(){
        List<UserRoofData> measurements = userRoofDataRepo.findAll();
        return  measurements;
    }

    @GetMapping(value = "/test")
    public String testController(){
        return  "php made it to the controller";
    }

    @PostMapping(value = "/calculate")
    public List<UserRoofData> calculations(@RequestBody UserRoofData cal){

        UserRoofData data = userRoofDataService.createRoofData(cal);

        userRoofDataRepo.save(data);

        // Deck Measurements
        Integer deckSQ = userRoofDataService.deckAreaCalculations(data.getDeck_area());
        Integer parapetSQ = userRoofDataService.parapetCalculations(data.getParapet_area());
        Integer totalRoofSQ = userRoofDataService.totalRoofSquares(deckSQ , parapetSQ);
        Integer totalRoofSQF = userRoofDataService.totalRoofSQF(data.getDeck_area(),data.getParapet_area());

        // Iso BoarCount and Screw Counts
        Double isoBoardCount = userRoofDataService.isoBoardCount(deckSQ);
        Double isoBoardScrewCount = userRoofDataService.isoScrewCount(deckSQ);

        //Screw Size
        Integer screwSize =  userRoofDataService.screwSize(data.getInsulationValue());
        String screwType = userRoofDataService.screwType(data.getDeckType());

        // RTU and Accessories
        int rtuLf = data.getRtuLF();
        int termBar = userRoofDataService.terminationBarCount(rtuLf);
        int caulk = userRoofDataService.sealerCaulk(rtuLf);

        //











        return  new ArrayList<>();
    }
}
