package com.d288.TravelAgencyProject.dao;

import com.d288.TravelAgencyProject.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
