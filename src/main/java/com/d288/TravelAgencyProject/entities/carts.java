package com.d288.TravelAgencyProject.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "carts")
@Data
public class carts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long cartId;
    @Column(name = "package_price")
    private BigDecimal packagePrice;
    @Column(name = "")
    private Date lastUpdate;
    @Column(name = "cart_id")
    private Long cartId;
    @Column(name = "vacation_id")
    private Long vacationID;
}
