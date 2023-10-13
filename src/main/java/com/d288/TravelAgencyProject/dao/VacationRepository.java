package com.d288.TravelAgencyProject.dao;


import com.d288.TravelAgencyProject.entities.Vacation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacationRepository extends JpaRepository<Vacation, Long> {
}
