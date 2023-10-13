package com.d288.TravelAgencyProject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "excursion_cartitem")
@Data
public class ExcursionCartItem {

    @Id
    @ManyToOne
    @JoinColumn(name = "cart_item_id", nullable = false)
    private CartItem cartItem;

    @Id
    @ManyToOne
    @JoinColumn(name = "excursion_id", nullable = false)
    private Excursion excursion;

}
