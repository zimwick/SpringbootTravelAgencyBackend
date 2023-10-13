package com.d288.TravelAgencyProject.dao;


import com.d288.TravelAgencyProject.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
