package com.nobledigitalservices.apilord.weather.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class WeatherStationService {

    ObjectMapper objectMapper = new ObjectMapper();

public String jsonMarshalling(String json, String desiredNode) throws  JsonProcessingException {
    JsonNode jsonNode = objectMapper.readTree(json);
    return String.valueOf(jsonNode.get(desiredNode));
}




}
