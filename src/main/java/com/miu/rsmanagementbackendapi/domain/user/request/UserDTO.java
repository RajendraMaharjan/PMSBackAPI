package com.miu.rsmanagementbackendapi.domain.user.request;

import com.miu.rsmanagementbackendapi.domain.auth.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    private Collection<Role> roles;
}
