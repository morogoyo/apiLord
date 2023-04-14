package com.nobledigitalservices.apilord.roofing.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Measurements {

    @Id
    @GeneratedValue
    @Column
    Long id;
    @Column
    String comments;
    @Column
    String subject;
    @Column
    Double length;
    @Column
    Double area;
    @Column
    Double count;

}
