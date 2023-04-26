package com.miu.pmtbackendapi.domain.user;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq")
    @SequenceGenerator(name = "my_seq", sequenceName = "my_sequence", allocationSize = 1)
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String contactNumber;
    @Enumerated(EnumType.STRING)
    private UserStatusEnum userStatus;

//    @ManyToMany(mappedBy = "user")
//    List<FavouriteProperty> favouriteProperty;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<UserRole> userRole;

    @JsonManagedReference
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Property> properties;
}