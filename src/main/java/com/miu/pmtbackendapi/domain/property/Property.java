package com.miu.pmtbackendapi.domain.property;

import com.miu.pmtbackendapi.domain.address.Address;
import com.miu.pmtbackendapi.domain.enums.PropertyStatusEnum;
import com.miu.pmtbackendapi.domain.image.PropertyImage;
import com.miu.pmtbackendapi.domain.propertydetail.PropertyDetail;
import com.miu.pmtbackendapi.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long propertyId;

    PropertyStatusEnum statusEnum;

    @OneToOne
    Address address;

    @OneToOne
    PropertyDetail propertyDetail;

    @OneToMany
    @JoinTable(name = "property_propertyimage")
    List<PropertyImage> propertyImages;

//    @ManyToMany(mappedBy = "property")
//    List<FavouriteProperty> favouriteProperty;

    @ManyToOne
    private User owner;


}