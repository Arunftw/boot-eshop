package com.proj.boot.customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proj.boot.product.Product;
@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer>{

}
