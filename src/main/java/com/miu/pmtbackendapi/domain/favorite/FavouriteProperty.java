package com.miu.pmtbackendapi.domain.favorite;

import com.miu.pmtbackendapi.domain.property.Property;
import com.miu.pmtbackendapi.domain.user.User;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class FavouriteProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long favPropertyId;

//    @ManyToMany
//    @JoinTable(name = "favouriteProperty_user")
//    List<User> user;
//
//    @ManyToMany
//    @JoinTable(name = "favouriteProperty_property")
//    List<Property> property;

    @ManyToOne
    @JoinColumn(name = "pf_user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "fp_propery_id")
    Property property;
}


