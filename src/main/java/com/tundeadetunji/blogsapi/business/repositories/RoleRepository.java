package com.tundeadetunji.blogsapi.business.repositories;

import com.tundeadetunji.blogsapi.business.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
