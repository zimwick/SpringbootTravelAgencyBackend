package com.d288.TravelAgencyProject.services;

import org.springframework.web.bind.annotation.CrossOrigin;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
