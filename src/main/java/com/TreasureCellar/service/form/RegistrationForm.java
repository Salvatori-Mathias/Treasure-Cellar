package com.TreasureCellar.service.form;

import lombok.Data;

@Data
public class RegistrationForm {
    private String userName;
    private String lastName;
    private String firstName;
    private String email;
    private String password;
    private String confirmPassword;

}
