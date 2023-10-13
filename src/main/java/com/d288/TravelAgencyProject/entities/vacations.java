package com.d288.TravelAgencyProject.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "vacations")
@Data
public class vacations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vacation_id")
    private Long vacationId;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date createDate;

    @Column(name = "description")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date lastUpdate;

    @Column(name = "travel_fare_price")
    private BigDecimal travelFarePrice;

    @Column(name = "vacation_title")
    private String vacationTitle;
}
