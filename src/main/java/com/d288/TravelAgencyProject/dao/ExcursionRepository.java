package com.d288.TravelAgencyProject.dao;

import com.d288.TravelAgencyProject.entities.Excursion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExcursionRepository extends JpaRepository<Excursion, Long> {
}
