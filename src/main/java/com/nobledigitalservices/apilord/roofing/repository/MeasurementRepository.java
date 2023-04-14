package com.nobledigitalservices.apilord.roofing.repository;

import com.nobledigitalservices.apilord.roofing.model.Measurements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurementRepository extends JpaRepository<Measurements, Long > {
}
