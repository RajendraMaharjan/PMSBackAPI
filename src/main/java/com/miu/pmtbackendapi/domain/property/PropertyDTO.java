package com.miu.pmtbackendapi.domain.property;

import com.miu.pmtbackendapi.domain.address.Address;
import com.miu.pmtbackendapi.domain.address.AddressDTO;
import com.miu.pmtbackendapi.domain.enums.PropertyStatusEnum;
import com.miu.pmtbackendapi.domain.image.PropertyImage;
import com.miu.pmtbackendapi.domain.image.PropertyImageDTO;
import com.miu.pmtbackendapi.domain.propertydetail.PropertyDetail;
import com.miu.pmtbackendapi.domain.propertydetail.PropertyDetailDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    PropertyStatusEnum statusEnum;

    AddressDTO address;

    PropertyDetailDTO propertyDetail;

    List<PropertyImageDTO> propertyImages;
}
