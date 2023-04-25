package com.miu.pmtbackendapi.domain.user;

import com.miu.pmtbackendapi.domain.auth.UserRole;
import com.miu.pmtbackendapi.domain.enums.UserStatusEnum;
import com.miu.pmtbackendapi.domain.property.Property;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String contactNumber;
    private UserStatusEnum userStatus;

//    @ManyToMany(mappedBy = "user")
//    List<FavouriteProperty> favouriteProperty;

    @OneToMany
    List<UserRole> userRole;

    @OneToMany(mappedBy = "owner")
    private List<Property> properties;
}