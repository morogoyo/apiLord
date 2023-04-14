package com.nobledigitalservices.apilord.roofing.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Supplies {

    String brand;
    String warranty;
    String attachment;
    Integer insulationValue;
    String deckType;
    Integer membrane_thickness;
    Integer deck_area;
    Integer parapet_area;
    Integer rtuLF;
    Integer outsideCorners;
    Integer copingStretch;
    Integer copingLF;
    Integer downSpoutLF;
    Integer collectorHeads;
    Integer membraneStretch;
    Integer pitchPockets;
    Integer closeBoot;
    Integer drains;
    Integer vents;
    Integer walkpads;

}

