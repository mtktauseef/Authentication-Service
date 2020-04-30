package com.ecommerce.authenticationservice.models;

/*
 * @Author Tauseef
 * created on 4/12/2020
 */
public class UserBuilder {

    Long id;
    String name;
    String username;
    String email;
    String password;

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }
}