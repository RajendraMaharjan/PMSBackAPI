package com.miu.pmtbackendapi.domain.property;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.miu.pmtbackendapi.domain.address.Address;
import com.miu.pmtbackendapi.domain.address.AddressDTO;
import com.miu.pmtbackendapi.domain.enums.PropertyStatusEnum;
import com.miu.pmtbackendapi.domain.image.PropertyImage;
import com.miu.pmtbackendapi.domain.image.PropertyImageDTO;
import com.miu.pmtbackendapi.domain.propertydetail.PropertyDetail;
import com.miu.pmtbackendapi.domain.propertydetail.PropertyDetailDTO;
import com.miu.pmtbackendapi.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyDTO {

    private Long propertyId;

    @Enumerated(EnumType.STRING)
    PropertyStatusEnum statusEnum;

    Address address;

    PropertyDetail propertyDetail;

    List<PropertyImage> propertyImages;

    private User owner;
}
