package com.aryan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aryan.model.Order;

public interface OrderRepository extends MongoRepository<Order,Integer> {

}
