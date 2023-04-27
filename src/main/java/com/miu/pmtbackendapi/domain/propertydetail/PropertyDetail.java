package com.miu.pmtbackendapi.domain.propertydetail;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.miu.pmtbackendapi.domain.address.Address;
import com.miu.pmtbackendapi.domain.enums.HomeConditionEnum;
import com.miu.pmtbackendapi.domain.enums.PropertyTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq")
    @SequenceGenerator(name = "my_seq", sequenceName = "my_sequence", allocationSize = 1)
    private Long pdId;

    @Enumerated(EnumType.STRING)
    PropertyTypeEnum propertyType;
    private Float lotSize;
    private Float homeSize;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    Address address;

//    @Temporal(TemporalType.DATE)
    String yearBuild;


    private Integer roomNum;
    private Integer fullBathroomNum;
    private Integer partialBathroomNum;
    private Double propertyPrice;
    private Double mortgageBalance;

    @Enumerated(EnumType.STRING)
    private HomeConditionEnum homeCondition;

    private Boolean hasTenant;


}
