package com.miu.pmtbackendapi.domain.offer;

import com.miu.pmtbackendapi.domain.property.Property;
import com.miu.pmtbackendapi.domain.user.User;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long offerId;
    private LocalDateTime submissionDate;

    @ManyToOne
//    @JoinColumn(name = "user_offer")
    User user;

    private Double offeredPrice;

    @OneToOne
    Property property;


}
