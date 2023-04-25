package com.miu.pmtbackendapi.domain.propertydetail;

import com.miu.pmtbackendapi.domain.address.Address;
import com.miu.pmtbackendapi.domain.enums.HomeConditionEnum;
import com.miu.pmtbackendapi.domain.enums.PropertyTypeEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class PropertyDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pdId;
    PropertyTypeEnum propertyType;
    private Float lotSize;
    private Float homeSize;

    @OneToOne
    Address address;

    @Temporal(TemporalType.DATE)
    Date yearBuild;

    private Integer roomNum;
    private Integer fullBathroomNum;
    private Integer partialBathroomNum;
    private Double propertyPrice;
    private Double mortgageBalance;

    private HomeConditionEnum homeCondition;

    private Boolean hasTenant;


}
