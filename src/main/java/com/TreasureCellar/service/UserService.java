package com.TreasureCellar.service;

import com.TreasureCellar.model.User;
import com.TreasureCellar.repository.UserRepository;
import com.TreasureCellar.service.form.RegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service("UserService")
public class UserService {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registration(final RegistrationForm form) {
        User user = new User();
        user.setFirstName(form.getFirstName());
        user.setLastName(form.getLastName());
        user.setEmail(form.getEmail());
        user.setPassword(passwordEncoder.encode(form.getPassword()));

        return userRepository.save(user);
    }

    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }





}