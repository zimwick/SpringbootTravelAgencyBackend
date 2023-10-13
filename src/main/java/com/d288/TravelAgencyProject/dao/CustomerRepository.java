package com.d288.TravelAgencyProject.dao;

import com.d288.TravelAgencyProject.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
