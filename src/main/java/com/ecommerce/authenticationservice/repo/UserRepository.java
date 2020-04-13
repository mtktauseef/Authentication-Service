package com.ecommerce.authenticationservice.repo;

import com.ecommerce.authenticationservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
