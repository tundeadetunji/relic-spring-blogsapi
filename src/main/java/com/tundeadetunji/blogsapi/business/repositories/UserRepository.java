package com.tundeadetunji.blogsapi.business.repositories;

import com.tundeadetunji.blogsapi.business.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
