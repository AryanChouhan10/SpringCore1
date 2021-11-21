package com.aryan.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.aryan.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer,Integer>{

}
