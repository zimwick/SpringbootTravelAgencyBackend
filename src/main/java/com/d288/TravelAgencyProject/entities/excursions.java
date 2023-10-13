package com.d288.TravelAgencyProject.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "excursions")
@Data
public class excursions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "excursion_id")
    private Long excursionId;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date createDate;

    @Column(name = "excursion_price")
    private BigDecimal excursionPrice;

    @Column(name = "excursion_title")
    private String excursionTitle;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date lastUpdate;

    @Column(name = "vacation_id")
    private Long vacationId;
}
