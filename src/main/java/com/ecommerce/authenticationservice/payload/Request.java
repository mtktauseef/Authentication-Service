package com.ecommerce.authenticationservice.payload;

/*
 * @Author Tauseef, Prashant, Rainy, Tarun
 * created on 4/16/2020
 */

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Request {
    @NotBlank
    @Size(max = 40)
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}