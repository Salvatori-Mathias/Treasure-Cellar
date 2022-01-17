package com.TreasureCellar.repository;

import com.TreasureCellar.model.Product;
import com.TreasureCellar.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

 @Repository
    public interface ProductRepository extends CrudRepository<Product, Long> {
}
