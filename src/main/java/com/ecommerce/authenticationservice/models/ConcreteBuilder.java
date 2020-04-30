package com.ecommerce.authenticationservice.models;

import com.ecommerce.authenticationservice.models.ConcreteUser;

/*
 * @Author Tauseef
 * created on 4/12/2020
 */
public class ConcreteBuilder {
    Long id;
    String name;
    String username;
    String email;
    String password;

    public ConcreteBuilder(){

    }

    public ConcreteBuilder setName(String name){
        this.name = name;
        return this;
    }

    public ConcreteBuilder setUsername(String username){
        this.username = username;
        return this;
    }

    public ConcreteBuilder setPassword(String password){
        this.password = password;
        return this;
    }

    public ConcreteBuilder setEmail(String email){
        this.email = email;
        return this;
    }

    public ConcreteUser build() {
        return new ConcreteUser(name,username,email,password);
    }

}

