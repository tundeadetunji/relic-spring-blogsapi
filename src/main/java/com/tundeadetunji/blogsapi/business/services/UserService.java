package com.tundeadetunji.blogsapi.business.services;

import com.tundeadetunji.blogsapi.business.models.Role;
import com.tundeadetunji.blogsapi.business.models.User;

import java.util.List;

public interface UserService {
    User getUser(String username);
    List<User> getUsers();
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);

}
