package com.miu.pmtbackendapi.domain.offer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
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
//    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private String submissionDate;

    @ManyToOne
//    @JoinColumn(name = "user_offer")
    User user;

    private Double offeredPrice;

    @OneToOne
    Property property;


}
