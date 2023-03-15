package com.nobledigitalservices.apilord.weather.entity;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Weather {

    private long id;

    private Double latitude;
    private Double longitude;
    private Double elevation;

    private String time;

}
