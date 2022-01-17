package com.TreasureCellar.repository;

import com.TreasureCellar.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

Optional<User> findUserByEmail(String email);

}
