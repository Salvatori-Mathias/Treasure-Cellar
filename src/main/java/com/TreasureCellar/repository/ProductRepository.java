package com.TreasureCellar.repository;

import com.TreasureCellar.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

 @Repository
    public interface ProductRepository extends CrudRepository<Account, Long> {
}
