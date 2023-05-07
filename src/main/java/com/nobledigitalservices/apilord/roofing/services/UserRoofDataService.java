package com.nobledigitalservices.apilord.roofing.services;

import com.nobledigitalservices.apilord.roofing.model.UserRoofData;
import org.springframework.stereotype.Service;

@Service
public class UserRoofDataService {
    // Create Round up method will be needed for all measurements

    // Method to add all of one kind

    // pitch Pocket Method and all of its necessities

    // term Bar measurements and its accessories

    //

    //Create functions to cover all the following math

    /*
    DeckSQ x  sqf * 100
    ParapetSQ x sqf * 100
    Total Roof SQ x  DeckSQ * ParapetSQ
    Screw Size x depending on insulation value
    Screw Type x depends on deck type
    close Boot   Just a count to be use in others places
    Iso Board x  DeckSQ * 6.125
    Iso Screw Count   Iso Board * 5
    Iso Plates        Sames as above for Iso Screw Count
    Field Rolls x    Coping Metal LF *
    Field Screws x  Fieldrolls * 200
    Cleat Plates x  deckSQ * 100 / 1000
    Picture Frame screws  x  Coping Metal  / 100
    Picture Frame Rolls x    Coping Metal  / 100
    Termination Bar  x termBars = rtulf / 10;
    Mastic x rtulf / 350;
    Split Boots x Self Return
    Wall Plates
    Picture Frames
    PVC Vent Calculations x   deckAreaSQF / 1000;

     */

    //Deck Area Calculations
    public int deckAreaCalculations(int deckAreaSQF) {
        int deckSQ = deckAreaSQF / 100;
        return deckSQ;
    }

    // pvc vent calculations
    public int pvcVents(int deckAreaSQF) {
        int pvcVentCount = deckAreaSQF / 1000;
        return pvcVentCount;
    }

    // need to show this value
    public int parapetCalculations(int parapetAreaSQF) {
        int parapetSQ = parapetAreaSQF / 100;
        return parapetSQ;
    }


    //totalRoofSquares
    public int totalRoofSquares(int deckAreaSQ, int parapetAreaSQ) {
        int totalSQ = parapetAreaSQ + deckAreaSQ;
        return totalSQ;
    }
public int totalRoofSQF(int deckAreaSQF, int parapetAreaSQF) {
        int totalSQF = parapetAreaSQF + deckAreaSQF;
        return totalSQF;
    }

    // total roll count
    public int rollCount(int totalSQ) {
        return totalSQ / 1000;
    }


    // field roll count
    public int pictureFrameRolls(int copingMetalLinearFoot) {
        int tfr = (int) Math.ceil((float) copingMetalLinearFoot / 100);
        return tfr;
    }

    public int pictureFrameScrews(int copingMetalLinearFoot) {
        int tfr = ((int) Math.ceil((float) copingMetalLinearFoot / 100)) * 200;
        return tfr;
    }

    public int fieldRolls(int copingMetalLinearFoot) {
        int fieldRollCount = copingMetalLinearFoot / 100;
        return fieldRollCount;
    }

    public double fieldScrews(int deckSQ) {

        double screw = Math.ceil((deckSQ * 100) / 1000 * 200);

        return screw;
    }


    public String screwType(String deckType) {
        String screwType = deckType.equals("wood") ? "# 14 Screw" : "# 15 Screw";
        return screwType;
    }

    public int screwSize(int insulationValue) {
        return (insulationValue == (25)) ? 5 : 6;
    }

    public double isoBoardCount(double deckSQ) {
        return (deckSQ * 6.125);
    }

    public double isoScrewCount(double deckSQ)

    {
        double isoScrewCount = (deckSQ * 100 ) / 1000;
        return isoScrewCount;
    }

    public double cleatPlateCount(double deckSQ)

    {
        return ((deckSQ * 100) / 1000) *200;
    }

    public int terminationBarCount(int rtulf){
       int termBars = rtulf / 10;
       return termBars;
    }

    public int sealerCaulk(int rtulf){
        int sealerCaulk = rtulf / 350;
        return sealerCaulk;
    }

    // UserRoofData object creator
    public UserRoofData createRoofData(UserRoofData cal){

        UserRoofData data = new UserRoofData();
        // Variables that will not have calculations
        data.setBrand(cal.getBrand());
        data.setWarranty(cal.getWarranty());
        data.setAttachment(cal.getAttachment());
        data.setInsulationValue(cal.getInsulationValue());
//        String deckType = cal.getDeckType();
        data.setMembrane_thickness( cal.getMembrane_thickness());
        data.setSplitBoot(cal.getSplitBoot());
        data.setOutsideCorners(cal.getOutsideCorners());
        data.setCopingStretch( cal.getCopingStretch());
        data.setCopingLF( cal.getCopingLF());
        data.setDownSpoutLF(cal.getDownSpoutLF());
        data.setCollectorHeads(cal.getCollectorHeads());
        data.setMembraneStretch( cal.getMembraneStretch());
        data.setPitchPockets( cal.getPitchPockets());
        data.setCloseBoot(cal.getCloseBoot());
        data.setDrains( cal.getDrains());
        data.setVents(cal.getVents());
        data.setWalkpads(cal.getWalkpads());

        return data;
    }

//    public Map<k,v> splitBoots(int splitBoots){
//        return splitBoots;
//    }


//
//    function _insulationBoardCount(deckArea) {
//        // var ibc = $('#insulationBoardCount').val();
//        console.log(typeof deckArea);
//        console.log(deckArea);
//
//        return Math.ceil(_toSquares(deckArea) * 6.25);
//    }
//
//    function _insulationBoardScrews(deckArea) {
//        console.log(typeof deckArea)
//        console.log(parseInt(deckArea))
//        return Math.ceil((deckArea * 3.12) * 5);
//    }
//
//
//    function _mastic(rtu) {
//        return rtu / 350;
//    }
//
//    function _termBar(rtu) {
//        return rtu / 10;
//    }
//
//
//    // Need to add a flag to decide if this is needed
//    function _pvcVents(deckSQ) {
//        return Math.ceil(deckSQ / 1000);
//    }
//
//    function _walkpads(walkpadStretch) {
//        return ((walkpadStretch / 12) / 60) * 12;
//    }
//
//    function _restoreAllValues(answersArray) {
//        // console.log(answersArray.toString());
//        for (const x of answersArray){
//            // console.log(x);
//            $(x).text(localStorage.getItem(x));
//            // console.log($(x).text(localStorage.getItem(x)));
//        }
//    }
//
//    function _saveAllValuesLocaly(key, value) {
//        localStorage.setItem(key, value)
//    }
//
//    function _clearAllValuesLocaly() {
//        localStorage.clear();
//    }
//
//    function _totalRollCount(deckSQ) {
//        // let totalDeckSquares = localStorage.getItem('#');
//        return ((deckSQ * 100) / 1000);
//    }
//
//    function _screwCount() {
//        let totalSquares = localStorage.getItem('#totalSQ');
//        return ((totalSquares * 100) / 1000) * 200;
//    }


}
