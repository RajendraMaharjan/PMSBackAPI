package com.miu.pmtbackendapi.domain.user;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.miu.pmtbackendapi.domain.auth.UserRole;
import com.miu.pmtbackendapi.domain.enums.UserStatusEnum;
import com.miu.pmtbackendapi.domain.property.Property;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.List;
import java.util.Set;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
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

//<<<<<<< HEAD
//    //    @OneToMany
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "users_role",
//            joinColumns = {@JoinColumn(name = "user_id")},
//            inverseJoinColumns = {@JoinColumn(name = "role_id")})
//    Set<UserRole> userRole;
//=======
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    List<UserRole> userRole;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "users_role",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    Collection<UserRole> userRole;

    @JsonManagedReference
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Property> properties;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", userStatus=" + userStatus +
                ", userRole=" + userRole +
                ", properties=" + properties +
                '}';
    }
}