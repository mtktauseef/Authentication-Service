package com.ecommerce.authenticationservice.repository;

import com.ecommerce.authenticationservice.models.Role;
import com.ecommerce.authenticationservice.models.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/*
 * @Author Tauseef
 * created on 4/25/2020
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}