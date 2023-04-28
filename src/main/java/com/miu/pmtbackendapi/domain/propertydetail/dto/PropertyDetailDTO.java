package com.miu.pmtbackendapi.domain.propertydetail.dto;

import com.miu.pmtbackendapi.domain.address.dto.AddressDTO;
import com.miu.pmtbackendapi.domain.enums.HomeConditionEnum;
import com.miu.pmtbackendapi.domain.enums.PropertyTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyDetailDTO {

    private Long pdId;

    PropertyTypeEnum propertyType;
    private Float lotSize;
    private Float homeSize;

    AddressDTO address;

    Integer yearBuild;

    private Integer roomNum;
    private Integer fullBathroomNum;
    private Integer partialBathroomNum;
    private Double propertyPrice;
    private Double mortgageBalance;
    private HomeConditionEnum homeCondition;

    private Boolean hasTenant;
}
