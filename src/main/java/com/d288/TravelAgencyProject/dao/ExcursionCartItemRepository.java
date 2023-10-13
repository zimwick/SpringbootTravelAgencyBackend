package com.d288.TravelAgencyProject.dao;

import com.d288.TravelAgencyProject.entities.ExcursionCartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExcursionCartItemRepository extends JpaRepository<ExcursionCartItem, Long> {
}
