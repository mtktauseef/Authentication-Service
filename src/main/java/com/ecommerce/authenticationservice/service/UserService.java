package com.ecommerce.authenticationservice.service;
/*
 * @Author TechMtk
 * created on 4/10/2020
 */

import com.ecommerce.authenticationservice.models.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
