package com.d288.TravelAgencyProject.services;

import com.d288.TravelAgencyProject.entities.Cart;
import com.d288.TravelAgencyProject.entities.CartItem;
import com.d288.TravelAgencyProject.entities.Customer;
import lombok.Data;
import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Cart cart;
    private Set<CartItem> cartItems;
}
