package com.nobledigitalservices.apilord.weather.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class WeatherStationService {


public String jsonMarshalling(String json, String desiredNode) throws  JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    JsonNode jsonNode = objectMapper.readTree(json);
    String time = String.valueOf(jsonNode.get(desiredNode));
    return time;
}


}
