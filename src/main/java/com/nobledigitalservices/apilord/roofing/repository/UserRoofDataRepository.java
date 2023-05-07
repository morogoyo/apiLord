package com.nobledigitalservices.apilord.roofing.repository;

import com.nobledigitalservices.apilord.roofing.model.UserRoofData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoofDataRepository extends JpaRepository<UserRoofData, Long > {
}
