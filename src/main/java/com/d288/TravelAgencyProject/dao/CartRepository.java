package com.d288.TravelAgencyProject.dao;

import com.d288.TravelAgencyProject.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
