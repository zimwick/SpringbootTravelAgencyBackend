package com.d288.TravelAgencyProject.services;

import com.d288.TravelAgencyProject.dao.CartRepository;
import com.d288.TravelAgencyProject.dao.CustomerRepository;
import com.d288.TravelAgencyProject.entities.Cart;
import com.d288.TravelAgencyProject.entities.CartItem;
import com.d288.TravelAgencyProject.entities.Customer;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService{

    private CustomerRepository customerRepository;

    public CheckoutServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        //retrieve cart from repo
        Cart cart = purchase.getCart();

        //generate tracking number
        String orderTrackingNumber = generateOrderTrackingNumber();
        cart.setOrderTrackingNumber(orderTrackingNumber);

        //populate cart with cartItems
        Set<CartItem> cartItems = purchase.getCartItems();
        cartItems.forEach(item -> item.setCart(cart));

        //populate cart with cartitem and customer
        cart.setCartItem(purchase.getCartItems());
        cart.setCustomer(purchase.getCustomer());

        //populate customer with cart
        Customer customer = purchase.getCustomer();
        cart.setCustomer(customer);

        //save to database
        customerRepository.save(customer);


        //return a response

        return new PurchaseResponse(orderTrackingNumber);

    }

    private String generateOrderTrackingNumber() {

        // generate a randon UUID number
        return UUID.randomUUID().toString();
    }
}
