package com.miu.pmtbackendapi.domain.favorite;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.miu.pmtbackendapi.domain.property.Property;
import com.miu.pmtbackendapi.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class FavouriteProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq")
    @SequenceGenerator(name = "my_seq", sequenceName = "my_sequence", allocationSize = 1)
    private Long favPropertyId;

//    @ManyToMany
//    @JoinTable(name = "favouriteProperty_user")
//    List<User> user;
//
//    @ManyToMany
//    @JoinTable(name = "favouriteProperty_property")
//    List<Property> property;


    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "favouriteProperty_user")
    User user;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "favouriteProperty_property")
    Property property;
}


