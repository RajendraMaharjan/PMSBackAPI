package com.miu.pmtbackendapi.domain.property;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.miu.pmtbackendapi.domain.address.Address;
import com.miu.pmtbackendapi.domain.enums.PropertyStatusEnum;
import com.miu.pmtbackendapi.domain.image.PropertyImage;
import com.miu.pmtbackendapi.domain.propertydetail.PropertyDetail;
import com.miu.pmtbackendapi.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.io.Serializable;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Property
{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq")
    @SequenceGenerator(name = "my_seq", sequenceName = "my_sequence", allocationSize = 1)
    private Long propertyId;

    @Enumerated(EnumType.STRING)
    PropertyStatusEnum statusEnum;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    Address address;

    @OneToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    PropertyDetail propertyDetail;

    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY, mappedBy = "propertyImage")
    @Fetch(FetchMode.JOIN)
    @JsonManagedReference
    List<PropertyImage> propertyImages;

//    @ManyToMany(mappedBy = "property")
//    List<FavouriteProperty> favouriteProperty;
    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private User owner;


}
