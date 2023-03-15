package com.nobledigitalservices.apilord.weather.controllers;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.nobledigitalservices.apilord.weather.service.WeatherStationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherStation {

@Autowired
private RestTemplate restTemplate;

@Autowired
        private WeatherStationService ws;

Logger log = LoggerFactory.getLogger(WeatherStation.class);
    String url = "https://api.open-meteo.com/v1/forecast?latitude=28.55&longitude=-81.18&hourly=temperature_2m";

    @GetMapping("/weather")
    public ResponseEntity<?> getTemperature(){
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<?> request = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, request, String.class);
        String result = response.getBody();
        log.info(result);
        String theTime = null;
        try {
            theTime = ws.jsonMarshalling(result, "hourly");
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }


        System.out.println(theTime);

        return  ResponseEntity.ok(theTime);
    }


}
