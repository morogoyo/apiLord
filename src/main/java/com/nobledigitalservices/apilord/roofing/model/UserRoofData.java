package com.nobledigitalservices.apilord.roofing.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_roof_data")
public class UserRoofData {

    @Id
    @GeneratedValue
    @Column
    Long id;
    @Column
    String brand;
    @Column
    String warranty;
    @Column
    String attachment;
    @Column
    Integer insulationValue;
    @Column
    String deckType;
    @Column
    Integer membrane_thickness;
    @Column
    Integer deck_area;
    @Column
    Integer parapet_area;
    @Column
    Integer rtuLF;
    @Column
    Integer outsideCorners;
    @Column
    Integer copingStretch;
    @Column
    Integer copingLF;
    @Column
    Integer downSpoutLF;
    @Column
    Integer collectorHeads;
    @Column
    Integer membraneStretch;
    @Column
    Integer pitchPockets;
    @Column
    Integer closeBoot;
    @Column
    Integer splitBoot;
    @Column
    Integer drains;
    @Column
    Integer vents;
    @Column
    Integer walkpads;

}

